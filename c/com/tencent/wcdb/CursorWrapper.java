package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

public class CursorWrapper implements Cursor {
    public final Cursor mCursor;

    public CursorWrapper(Cursor cursor) {
        this.mCursor = cursor;
    }

    public void close() {
        this.mCursor.close();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.mCursor.copyStringToBuffer(i, charArrayBuffer);
    }

    public void deactivate() {
        this.mCursor.deactivate();
    }

    public byte[] getBlob(int i) {
        return this.mCursor.getBlob(i);
    }

    public int getColumnCount() {
        return this.mCursor.getColumnCount();
    }

    public int getColumnIndex(String str) {
        return this.mCursor.getColumnIndex(str);
    }

    public int getColumnIndexOrThrow(String str) {
        return this.mCursor.getColumnIndexOrThrow(str);
    }

    public String getColumnName(int i) {
        return this.mCursor.getColumnName(i);
    }

    public String[] getColumnNames() {
        return this.mCursor.getColumnNames();
    }

    public int getCount() {
        return this.mCursor.getCount();
    }

    public double getDouble(int i) {
        return this.mCursor.getDouble(i);
    }

    public Bundle getExtras() {
        return this.mCursor.getExtras();
    }

    public float getFloat(int i) {
        return this.mCursor.getFloat(i);
    }

    public int getInt(int i) {
        return this.mCursor.getInt(i);
    }

    public long getLong(int i) {
        return this.mCursor.getLong(i);
    }

    public Uri getNotificationUri() {
        return null;
    }

    public int getPosition() {
        return this.mCursor.getPosition();
    }

    public short getShort(int i) {
        return this.mCursor.getShort(i);
    }

    public String getString(int i) {
        return this.mCursor.getString(i);
    }

    public int getType(int i) {
        return this.mCursor.getType(i);
    }

    public boolean getWantsAllOnMoveCalls() {
        return this.mCursor.getWantsAllOnMoveCalls();
    }

    public Cursor getWrappedCursor() {
        return this.mCursor;
    }

    public boolean isAfterLast() {
        return this.mCursor.isAfterLast();
    }

    public boolean isBeforeFirst() {
        return this.mCursor.isBeforeFirst();
    }

    public boolean isClosed() {
        return this.mCursor.isClosed();
    }

    public boolean isFirst() {
        return this.mCursor.isFirst();
    }

    public boolean isLast() {
        return this.mCursor.isLast();
    }

    public boolean isNull(int i) {
        return this.mCursor.isNull(i);
    }

    public boolean move(int i) {
        return this.mCursor.move(i);
    }

    public boolean moveToFirst() {
        return this.mCursor.moveToFirst();
    }

    public boolean moveToLast() {
        return this.mCursor.moveToLast();
    }

    public boolean moveToNext() {
        return this.mCursor.moveToNext();
    }

    public boolean moveToPosition(int i) {
        return this.mCursor.moveToPosition(i);
    }

    public boolean moveToPrevious() {
        return this.mCursor.moveToPrevious();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.mCursor.registerContentObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mCursor.registerDataSetObserver(dataSetObserver);
    }

    public boolean requery() {
        return this.mCursor.requery();
    }

    public Bundle respond(Bundle bundle) {
        return this.mCursor.respond(bundle);
    }

    public void setExtras(Bundle bundle) {
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.mCursor.setNotificationUri(contentResolver, uri);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.mCursor.unregisterContentObserver(contentObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mCursor.unregisterDataSetObserver(dataSetObserver);
    }
}
