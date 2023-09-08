package com.tencent.p014mm.sdk.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/* renamed from: com.tencent.mm.sdk.storage.ConfigFile */
public class ConfigFile {
    private static final String TAG = "MicroMsg.ReadConfig";
    private String filePath;
    private Properties propertie;

    public ConfigFile(String str) {
        InputStream inputStream = null;
        this.propertie = null;
        this.filePath = null;
        this.propertie = new Properties();
        this.filePath = str;
        try {
            inputStream = C86013q1.m106423E(str);
            this.propertie.load(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.m105921e(TAG, "Close File: %s Failed. [%s]", str, e.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    Log.m105921e(TAG, "Close File: %s Failed. [%s]", str, e2.getLocalizedMessage());
                }
            }
            throw th;
        }
    }

    public static int getIntValue(String str, String str2, int i) {
        Integer integerValue = new ConfigFile(str).getIntegerValue(str2);
        return integerValue == null ? i : integerValue.intValue();
    }

    public Integer getIntegerValue(String str) {
        String value = getValue(str);
        if (value == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(value));
        } catch (Exception e) {
            Log.m105921e(TAG, "getIntegerValue ParseInteger : %s Failed. [%s]", value, e.getLocalizedMessage());
            return null;
        }
    }

    public Long getLongValue(String str) {
        String value = getValue(str);
        if (value == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(value));
        } catch (Exception e) {
            Log.m105921e(TAG, "getLongValue ParseLong : %s Failed. [%s]", value, e.getLocalizedMessage());
            return null;
        }
    }

    public String getValue(String str) {
        Properties properties = this.propertie;
        if (properties == null || !properties.containsKey(str)) {
            return null;
        }
        return this.propertie.getProperty(str);
    }

    public boolean saveValue(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = C86013q1.m106429K(this.filePath, false);
            this.propertie.setProperty(str, str2);
            this.propertie.store(outputStream, "");
            if (outputStream == null) {
                return true;
            }
            try {
                outputStream.close();
                return true;
            } catch (IOException e) {
                Log.m105921e(TAG, "Close File: %s Failed. [%s]", this.filePath, e.getLocalizedMessage());
                return true;
            }
        } catch (Exception e2) {
            Log.m105921e(TAG, "Write File: %s Failed. [%s]", this.filePath, e2.getLocalizedMessage());
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    Log.m105921e(TAG, "Close File: %s Failed. [%s]", this.filePath, e3.getLocalizedMessage());
                }
            }
            return false;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.m105921e(TAG, "Close File: %s Failed. [%s]", this.filePath, e4.getLocalizedMessage());
                }
            }
            throw th;
        }
    }

    public static String getValue(String str, String str2) {
        return new ConfigFile(str).getValue(str2);
    }

    public static Integer getIntegerValue(String str, String str2) {
        return new ConfigFile(str).getIntegerValue(str2);
    }

    public static Long getLongValue(String str, String str2) {
        return new ConfigFile(str).getLongValue(str2);
    }

    public static long getLongValue(String str, String str2, long j) {
        Long longValue = new ConfigFile(str).getLongValue(str2);
        if (longValue == null) {
            return j;
        }
        return longValue.longValue();
    }

    public boolean saveValue(String str, long j) {
        return saveValue(str, String.valueOf(j));
    }

    public boolean saveValue(String str, int i) {
        return saveValue(str, String.valueOf(i));
    }

    public static boolean saveValue(String str, String str2, String str3) {
        return new ConfigFile(str).saveValue(str2, str3);
    }

    public static boolean saveValue(String str, String str2, long j) {
        return new ConfigFile(str).saveValue(str2, j);
    }

    public static boolean saveValue(String str, String str2, int i) {
        return new ConfigFile(str).saveValue(str2, i);
    }
}
