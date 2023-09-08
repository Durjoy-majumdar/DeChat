package com.tencent.wcdb;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow mWindow;

    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    public void clearOrCreateWindow(String str) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow == null) {
            this.mWindow = new CursorWindow(str);
        } else {
            cursorWindow.clear();
        }
    }

    public void closeWindow() {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        checkPosition();
        this.mWindow.copyStringToBuffer(this.mPos, i, charArrayBuffer);
    }

    public byte[] getBlob(int i) {
        checkPosition();
        return this.mWindow.getBlob(this.mPos, i);
    }

    public double getDouble(int i) {
        checkPosition();
        return this.mWindow.getDouble(this.mPos, i);
    }

    public float getFloat(int i) {
        checkPosition();
        return this.mWindow.getFloat(this.mPos, i);
    }

    public int getInt(int i) {
        checkPosition();
        return this.mWindow.getInt(this.mPos, i);
    }

    public long getLong(int i) {
        checkPosition();
        return this.mWindow.getLong(this.mPos, i);
    }

    public short getShort(int i) {
        checkPosition();
        return this.mWindow.getShort(this.mPos, i);
    }

    public String getString(int i) {
        checkPosition();
        return this.mWindow.getString(this.mPos, i);
    }

    public int getType(int i) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i);
    }

    public CursorWindow getWindow() {
        return this.mWindow;
    }

    public boolean hasWindow() {
        return this.mWindow != null;
    }

    @Deprecated
    public boolean isBlob(int i) {
        return getType(i) == 4;
    }

    @Deprecated
    public boolean isFloat(int i) {
        return getType(i) == 2;
    }

    @Deprecated
    public boolean isLong(int i) {
        return getType(i) == 1;
    }

    public boolean isNull(int i) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i) == 0;
    }

    @Deprecated
    public boolean isString(int i) {
        return getType(i) == 3;
    }

    public void onDeactivateOrClose() {
        super.onDeactivateOrClose();
        closeWindow();
    }

    public void setWindow(CursorWindow cursorWindow) {
        if (cursorWindow != this.mWindow) {
            closeWindow();
            this.mWindow = cursorWindow;
        }
    }
}
