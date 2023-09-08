package com.tencent.wcdb.database;

import com.tencent.wcdb.extension.SQLiteExtension;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class SQLiteDatabaseConfiguration {
    public static final String MEMORY_DB_PATH = ":memory:";
    public boolean customWALHookEnabled;
    public final LinkedHashSet<SQLiteExtension> extensions = new LinkedHashSet<>();
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public final String path;
    public int synchronousMode;
    public boolean updateNotificationEnabled;
    public boolean updateNotificationRowID;
    public String vfsName;

    public SQLiteDatabaseConfiguration(String str, int i) {
        if (str != null) {
            this.path = str;
            this.label = str;
            this.openFlags = i;
            this.synchronousMode = 2;
            this.maxSqlCacheSize = 25;
            this.locale = Locale.getDefault();
            this.vfsName = (i & 256) != 0 ? "vfslog" : null;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }

    public boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(MEMORY_DB_PATH);
    }

    public void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.path.equals(sQLiteDatabaseConfiguration.path)) {
            this.openFlags = sQLiteDatabaseConfiguration.openFlags;
            this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
            this.locale = sQLiteDatabaseConfiguration.locale;
            this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
            this.customWALHookEnabled = sQLiteDatabaseConfiguration.customWALHookEnabled;
            this.updateNotificationEnabled = sQLiteDatabaseConfiguration.updateNotificationEnabled;
            this.updateNotificationRowID = sQLiteDatabaseConfiguration.updateNotificationRowID;
            this.synchronousMode = sQLiteDatabaseConfiguration.synchronousMode;
            this.vfsName = sQLiteDatabaseConfiguration.vfsName;
            this.extensions.clear();
            this.extensions.addAll(sQLiteDatabaseConfiguration.extensions);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
