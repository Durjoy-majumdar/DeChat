package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zzxu;

    public CursorWrapper(Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            String name = cursor.getClass().getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unknown type: ".concat(name) : new String("Unknown type: "));
        } else {
            this.zzxu = (AbstractWindowedCursor) cursor;
        }
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.zzxu.fillWindow(i, cursorWindow);
    }

    public CursorWindow getWindow() {
        return this.zzxu.getWindow();
    }

    public AbstractWindowedCursor getWrappedCursor() {
        return this.zzxu;
    }

    public boolean onMove(int i, int i2) {
        return this.zzxu.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.zzxu.setWindow(cursorWindow);
    }
}
