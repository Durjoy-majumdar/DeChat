package com.tencent.p014mm.sdk.platformtools;

import android.util.ArrayMap;
import com.tencent.stubs.logger.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.tencent.mm.sdk.platformtools.ImmutableBundle */
public class ImmutableBundle {
    private static final String TAG = "MicroMsg.ImmutableBundle";
    private boolean mImmutable;
    public ArrayMap<String, Object> mMap;

    public ImmutableBundle(ArrayMap<String, Object> arrayMap) {
        this.mMap = null;
        this.mImmutable = false;
        this.mMap = new ArrayMap<>(arrayMap);
    }

    public boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public Object get(String str) {
        return this.mMap.get(str);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (boolean[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "byte[]", e);
            return null;
        }
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0).byteValue();
    }

    public byte[] getByteArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "byte[]", e);
            return null;
        }
    }

    public char getChar(String str) {
        return getChar(str, 0);
    }

    public char[] getCharArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (char[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "char[]", e);
            return null;
        }
    }

    public CharSequence getCharSequence(String str) {
        Object obj = this.mMap.get(str);
        try {
            return (CharSequence) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "CharSequence", e);
            return null;
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (CharSequence[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "CharSequence[]", e);
            return null;
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<CharSequence>", e);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (double[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "double[]", e);
            return null;
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "float[]", e);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (int[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "int[]", e);
            return null;
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "long[]", e);
            return null;
        }
    }

    public short getShort(String str) {
        return getShort(str, 0);
    }

    public short[] getShortArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (short[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "short[]", e);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.mMap.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "String", e);
            return null;
        }
    }

    public String[] getStringArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "String[]", e);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    public Set<String> keySet() {
        return this.mMap.keySet();
    }

    public void markImmutable() {
        this.mImmutable = true;
    }

    public void putAll(ArrayMap arrayMap) {
        if (!this.mImmutable) {
            this.mMap.putAll(arrayMap);
        }
    }

    public int size() {
        return this.mMap.size();
    }

    public void typeWarning(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.m106513w(TAG, "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.m106514w(TAG, "Attempt to cast generated internal exception:", classCastException);
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public Byte getByte(String str, byte b) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return Byte.valueOf(b);
        }
        try {
            return (Byte) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "Byte", Byte.valueOf(b), e);
            return Byte.valueOf(b);
        }
    }

    public char getChar(String str, char c) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Character", Character.valueOf(c), e);
            return c;
        }
    }

    public double getDouble(String str, double d) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public int getInt(String str, int i) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, DownloadSetting.TYPE_INTEGER, Integer.valueOf(i), e);
            return i;
        }
    }

    public long getLong(String str, long j) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Long", Long.valueOf(j), e);
            return j;
        }
    }

    public short getShort(String str, short s) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return s;
        }
        try {
            return ((Short) obj).shortValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Short", Short.valueOf(s), e);
            return s;
        }
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        CharSequence charSequence2 = getCharSequence(str);
        return charSequence2 == null ? charSequence : charSequence2;
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public ImmutableBundle() {
        this.mMap = null;
        this.mImmutable = false;
        this.mMap = new ArrayMap<>();
    }

    public void typeWarning(String str, Object obj, String str2, ClassCastException classCastException) {
        typeWarning(str, obj, str2, "<null>", classCastException);
    }
}
