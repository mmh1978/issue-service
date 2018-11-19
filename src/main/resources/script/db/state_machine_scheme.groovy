package script.db


databaseChangeLog(logicalFilePath: 'state_machine_scheme.groovy') {
    changeSet(id: '2018-08-07-add-table-state-machine-scheme', author: 'shinan.chenX@gmail') {
        createTable(tableName: "state_machine_scheme") {
            column(name: 'id', type: 'BIGINT UNSIGNED', autoIncrement: true, remarks: 'ID') {
                constraints(primaryKey: true)
            }
            column(name: 'name', type: 'VARCHAR(64)', remarks: '名称')
            column(name: 'description', type: 'VARCHAR(255)', remarks: '描述')
            column(name: 'organization_id', type: 'BIGINT UNSIGNED', remarks: '组织id')

            column(name: "OBJECT_VERSION_NUMBER", type: "BIGINT", defaultValue: "1")
            column(name: "CREATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "CREATION_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "LAST_UPDATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "LAST_UPDATE_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
        createIndex(tableName: "state_machine_scheme", indexName: "state_machine_scheme_n1") {
            column(name: "name", type: "VARCHAR(64)")
        }
        createIndex(tableName: "state_machine_scheme", indexName: "state_machine_scheme_n2") {
            column(name: "description", type: "VARCHAR(255)")
        }
        createIndex(tableName: "state_machine_scheme", indexName: "state_machine_scheme_n3") {
            column(name: "organization_id", type: "BIGINT UNSIGNED")
        }
    }
}