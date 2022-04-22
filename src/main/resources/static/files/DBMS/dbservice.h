#ifndef DBSERVICE_H
#define DBSERVICE_H
#include <QString>
#include <vector>
#include "dbentity.h"
#include "dbdao.h"
#include "global.h"
#include "stringutil.h"

using namespace std;
class DBService
{
public:
    DBService();
    bool createDatabase(QString databaseName);
    bool modifyDatabaseName(QString oldName,QString newName);
    bool deleteDatabase(QString databaseName);
    int countDBNum();
    vector<DBEntity> DBList;
private:
    DBDao* dbDao;
    StringUtil * stringUtil;
};

#endif // DBSERVICE_H
