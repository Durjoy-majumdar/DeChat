package com.tencent.kinda.gen;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ITransmitKvData {

    public static final class CppProxy extends ITransmitKvData {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ArrayList<String> native_allKeys(long j);

        private native byte[] native_getBinary(long j, String str);

        private native boolean native_getBool(long j, String str);

        private native ArrayList<Boolean> native_getBoolList(long j, String str);

        private native int native_getInt(long j, String str);

        private native ArrayList<Integer> native_getIntList(long j, String str);

        private native KJSEvent native_getJSEvent(long j, String str);

        private native ITransmitKvData native_getKvData(long j, String str);

        private native long native_getLong(long j, String str);

        private native ArrayList<Long> native_getLongList(long j, String str);

        private native String native_getString(long j, String str);

        private native ArrayList<String> native_getStringList(long j, String str);

        private native void native_putBinary(long j, String str, byte[] bArr);

        private native void native_putBool(long j, String str, boolean z);

        private native void native_putInt(long j, String str, int i);

        private native void native_putJSEvent(long j, String str, KJSEvent kJSEvent);

        private native void native_putKvData(long j, String str, ITransmitKvData iTransmitKvData);

        private native void native_putListBool(long j, String str, ArrayList<Boolean> arrayList);

        private native void native_putListInt(long j, String str, ArrayList<Integer> arrayList);

        private native void native_putListLong(long j, String str, ArrayList<Long> arrayList);

        private native void native_putListString(long j, String str, ArrayList<String> arrayList);

        private native void native_putLong(long j, String str, long j2);

        private native void native_putString(long j, String str, String str2);

        public ArrayList<String> allKeys() {
            return native_allKeys(this.nativeRef);
        }

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public byte[] getBinary(String str) {
            return native_getBinary(this.nativeRef, str);
        }

        public boolean getBool(String str) {
            return native_getBool(this.nativeRef, str);
        }

        public ArrayList<Boolean> getBoolList(String str) {
            return native_getBoolList(this.nativeRef, str);
        }

        public int getInt(String str) {
            return native_getInt(this.nativeRef, str);
        }

        public ArrayList<Integer> getIntList(String str) {
            return native_getIntList(this.nativeRef, str);
        }

        public KJSEvent getJSEvent(String str) {
            return native_getJSEvent(this.nativeRef, str);
        }

        public ITransmitKvData getKvData(String str) {
            return native_getKvData(this.nativeRef, str);
        }

        public long getLong(String str) {
            return native_getLong(this.nativeRef, str);
        }

        public ArrayList<Long> getLongList(String str) {
            return native_getLongList(this.nativeRef, str);
        }

        public String getString(String str) {
            return native_getString(this.nativeRef, str);
        }

        public ArrayList<String> getStringList(String str) {
            return native_getStringList(this.nativeRef, str);
        }

        public void putBinary(String str, byte[] bArr) {
            native_putBinary(this.nativeRef, str, bArr);
        }

        public void putBool(String str, boolean z) {
            native_putBool(this.nativeRef, str, z);
        }

        public void putInt(String str, int i) {
            native_putInt(this.nativeRef, str, i);
        }

        public void putJSEvent(String str, KJSEvent kJSEvent) {
            native_putJSEvent(this.nativeRef, str, kJSEvent);
        }

        public void putKvData(String str, ITransmitKvData iTransmitKvData) {
            native_putKvData(this.nativeRef, str, iTransmitKvData);
        }

        public void putListBool(String str, ArrayList<Boolean> arrayList) {
            native_putListBool(this.nativeRef, str, arrayList);
        }

        public void putListInt(String str, ArrayList<Integer> arrayList) {
            native_putListInt(this.nativeRef, str, arrayList);
        }

        public void putListLong(String str, ArrayList<Long> arrayList) {
            native_putListLong(this.nativeRef, str, arrayList);
        }

        public void putListString(String str, ArrayList<String> arrayList) {
            native_putListString(this.nativeRef, str, arrayList);
        }

        public void putLong(String str, long j) {
            native_putLong(this.nativeRef, str, j);
        }

        public void putString(String str, String str2) {
            native_putString(this.nativeRef, str, str2);
        }
    }

    public static native ITransmitKvData create();

    public abstract ArrayList<String> allKeys();

    public abstract byte[] getBinary(String str);

    public abstract boolean getBool(String str);

    public abstract ArrayList<Boolean> getBoolList(String str);

    public abstract int getInt(String str);

    public abstract ArrayList<Integer> getIntList(String str);

    public abstract KJSEvent getJSEvent(String str);

    public abstract ITransmitKvData getKvData(String str);

    public abstract long getLong(String str);

    public abstract ArrayList<Long> getLongList(String str);

    public abstract String getString(String str);

    public abstract ArrayList<String> getStringList(String str);

    public abstract void putBinary(String str, byte[] bArr);

    public abstract void putBool(String str, boolean z);

    public abstract void putInt(String str, int i);

    public abstract void putJSEvent(String str, KJSEvent kJSEvent);

    public abstract void putKvData(String str, ITransmitKvData iTransmitKvData);

    public abstract void putListBool(String str, ArrayList<Boolean> arrayList);

    public abstract void putListInt(String str, ArrayList<Integer> arrayList);

    public abstract void putListLong(String str, ArrayList<Long> arrayList);

    public abstract void putListString(String str, ArrayList<String> arrayList);

    public abstract void putLong(String str, long j);

    public abstract void putString(String str, String str2);
}
