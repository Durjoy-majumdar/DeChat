package com.tencent.xweb.util;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.ConfigDef;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ConfigParser {
    public static final String CONFIG_SIGNATURE_KEY = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn";
    public static final String TAG = "ConfigParser";

    private static String getConfigCheckValue(File file, int i, String str) {
        FileInputStream fileInputStream;
        try {
            byte[] bArr = new byte[i];
            fileInputStream = new FileInputStream(file);
            try {
                int read = fileInputStream.read(bArr, 0, i);
                if (read != i) {
                    FileUtils.tryClose(fileInputStream);
                    return null;
                }
                String str2 = new String(bArr, 0, read);
                int indexOf = str2.indexOf(str);
                if (indexOf < 0) {
                    FileUtils.tryClose(fileInputStream);
                    return null;
                }
                byte[] digest = MessageDigest.getInstance("MD5").digest(str2.substring(indexOf).getBytes());
                if (digest != null) {
                    if (digest.length != 0) {
                        StringBuilder sb = new StringBuilder(digest.length);
                        for (byte b : digest) {
                            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
                            if (hexString.length() == 1) {
                                sb.append(0);
                            }
                            sb.append(hexString);
                        }
                        String upperCase = sb.toString().toUpperCase();
                        FileUtils.tryClose(fileInputStream);
                        return upperCase;
                    }
                }
                FileUtils.tryClose(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    XWebLog.m21909e(TAG, "getConfigCheckValue error:" + th);
                    return null;
                } finally {
                    FileUtils.tryClose(fileInputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            XWebLog.m21909e(TAG, "getConfigCheckValue error:" + th);
            return null;
        }
    }

    private static ConfigDef.Patch[] getPatches(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("Patch");
        if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
            return null;
        }
        ConfigDef.Patch[] patchArr = new ConfigDef.Patch[elementsByTagName.getLength()];
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            ConfigDef.Patch patch = new ConfigDef.Patch();
            Element element2 = (Element) elementsByTagName.item(i);
            patch.strUrl = element2.getAttribute("url");
            patch.nTargetVersion = safeGetInt(element2, "targetVersion");
            patch.strMd5 = element2.getAttribute("md5");
            patch.bCanUseCellular = safeGetBoolean(element2, "useCellular");
            patch.bUseCdn = safeGetBoolean(element2, "useCdn");
            if (!element2.hasAttribute("patchType")) {
                patch.nPatchType = 1;
            } else if (element2.getAttribute("patchType").equals("1")) {
                patch.nPatchType = 1;
            } else if (element2.getAttribute("patchType").equals("2")) {
                patch.nPatchType = 2;
            } else {
                XWebLog.m21909e(TAG, "getPatches, error, unknown patchType");
                return null;
            }
            patchArr[i] = patch;
        }
        return patchArr;
    }

    public static ConfigDef.Config parse(String str) {
        if (str == null) {
            XWebLog.addInitializeLog(TAG, "parse config failed, path is empty");
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return parse(file, getConfigCheckValue(file, (int) file.length(), "<Versions>"));
        }
        XWebLog.addInitializeLog(TAG, "parse config failed, file not exist");
        return null;
    }

    private static void parseCommand(ConfigDef.Command command, Element element) {
        command.optype = element.getAttribute("optype");
        command.opvalue = element.getAttribute("opvalue");
        command.module = element.getAttribute("module");
        parseFilter(command.filter, element);
    }

    private static ConfigDef.Command[] parseCommandList(Element element) {
        if (element == null) {
            return null;
        }
        try {
            NodeList elementsByTagName = element.getElementsByTagName("command");
            StringBuilder sb = new StringBuilder();
            sb.append("parseCommandList, size:");
            sb.append(elementsByTagName != null ? elementsByTagName.getLength() : 0);
            XWebLog.m21908d(TAG, sb.toString());
            if (!(elementsByTagName == null || elementsByTagName.getLength() == 0)) {
                ConfigDef.Command[] commandArr = new ConfigDef.Command[elementsByTagName.getLength()];
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    ConfigDef.Command command = new ConfigDef.Command();
                    parseCommand(command, (Element) elementsByTagName.item(i));
                    commandArr[i] = command;
                }
                return commandArr;
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "parseCommandList error", th);
        }
        return null;
    }

    private static void parseFilter(ConfigDef.Filter filter, Element element) {
        filter.apkMin = safeGetInt(element, "apkMin");
        filter.apkMax = safeGetInt(element, "apkMax");
        filter.preDownApkMin = safeGetInt(element, "preDownApkMin");
        filter.preDownApkMax = safeGetInt(element, "preDownApkMax");
        filter.sdkMin = safeGetInt(element, "sdkMin");
        filter.sdkMax = safeGetInt(element, "sdkMax");
        filter.apiMin = safeGetInt(element, "apiMin");
        filter.apiMax = safeGetInt(element, "apiMax");
        filter.targetApiMin = safeGetInt(element, "targetApiMin");
        filter.targetApiMax = safeGetInt(element, "targetApiMax");
        filter.forbidDeviceRegex = element.getAttribute("forbidDeviceRegex");
        filter.whiteDeviceRegex = element.getAttribute("whiteDeviceRegex");
        filter.forbidAppRegex = element.getAttribute("forbidAppRegex");
        filter.whiteAppRegex = element.getAttribute("whiteAppRegex");
        filter.grayMin = safeGetInt(element, "grayMin");
        filter.grayMax = safeGetInt(element, "grayMax");
        filter.dayGrayMin = safeGetInt(element, "dayGrayMin");
        filter.dayGrayMax = safeGetInt(element, "dayGrayMax");
        filter.chromeMin = safeGetInt(element, "chromeMin");
        filter.chromeMax = safeGetInt(element, "chromeMax");
        filter.usertype = safeGetInt(element, "usertype");
        filter.x5sdkmin = safeGetInt(element, "x5sdkmin");
        filter.x5sdkmax = safeGetInt(element, "x5sdkmax");
        filter.x5coremin = safeGetInt(element, "x5coremin");
        filter.x5coremax = safeGetInt(element, "x5coremax");
        filter.hoursStart = safeGetDouble(element, "hoursStart", -1.0d);
        filter.hoursEnd = safeGetDouble(element, "hoursEnd", -1.0d);
        filter.runtimeAbis = element.getAttribute("runtimeAbis");
        filter.blackRuntimeAbis = element.getAttribute("blackRuntimeAbis");
        filter.deviceAbis = element.getAttribute("deviceAbis");
        filter.blackDeviceAbis = element.getAttribute("blackDeviceAbis");
        filter.appClientVerMin = safeGetIntFromHex(element, "appClientVerMin");
        filter.appClientVerMax = safeGetIntFromHex(element, "appClientVerMax");
        filter.appInfoWhiteList = element.getAttribute("appInfoWhiteList");
        filter.appInfoBlackList = element.getAttribute("appInfoBlackList");
    }

    public static ConfigDef.PluginConfig parsePluginConfig(String str) {
        if (str == null) {
            XWebLog.addInitializeLog(TAG, "parse plugin config failed, path is empty");
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return parsePluginConfig(file, getConfigCheckValue(file, (int) file.length(), "<Plugins>"));
        }
        XWebLog.addInitializeLog(TAG, "parse plugin config failed, file not exist");
        return null;
    }

    private static void parsePluginInfos(ConfigDef.PluginConfig pluginConfig, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("PluginInfo");
        if (elementsByTagName != null && elementsByTagName.getLength() != 0) {
            pluginConfig.plugins = new ConfigDef.PluginInfo[elementsByTagName.getLength()];
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element2 = (Element) elementsByTagName.item(i);
                ConfigDef.PluginInfo pluginInfo = new ConfigDef.PluginInfo();
                pluginInfo.strName = element2.getAttribute("name");
                pluginInfo.version = safeGetInt(element2, ProviderConstants.API_COLNAME_FEATURE_VERSION);
                pluginInfo.strUrl = element2.getAttribute("fullurl");
                pluginInfo.strMd5 = element2.getAttribute("md5");
                pluginInfo.bCanUseCellular = safeGetBoolean(element2, "useCellular");
                pluginInfo.lowPriority = safeGetBoolean(element2, "lowPriority");
                pluginInfo.bUseCdn = safeGetBoolean(element2, "useCdn");
                pluginInfo.nPeriod = safeGetInt(element2, "period");
                pluginInfo.versionId = safeGetInt(element2, "versionId");
                pluginInfo.updateSchedule = element2.getAttribute("updateSchedule");
                pluginInfo.releaseDate = element2.getAttribute("releaseDate");
                pluginInfo.UPDATE_SPEED_CONFIG = element2.getAttribute(CommandDef.COMMAND_UPDATE_SPEED_CONFIG);
                pluginInfo.UPDATE_FORWARD_SPEED_CONFIG = element2.getAttribute(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG);
                pluginInfo.UPDATE_SCHEDULE_TIME_RANGE_BIND = element2.getAttribute(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND);
                pluginInfo.updateStartTime = safeGetFloat(element2, "updateStartTime", -1.0f);
                pluginInfo.updateEndTime = safeGetFloat(element2, "updateEndTime", -1.0f);
                parseFilter(pluginInfo.filter, element2);
                pluginInfo.patches = getPatches(element2);
                pluginConfig.plugins[i] = pluginInfo;
            }
        }
    }

    private static void parseVersionInfos(ConfigDef.Config config, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("VersionInfo");
        if (elementsByTagName != null && elementsByTagName.getLength() != 0) {
            config.versions = new ConfigDef.Version[elementsByTagName.getLength()];
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                ConfigDef.Version version = new ConfigDef.Version();
                Element element2 = (Element) elementsByTagName.item(i);
                version.strUrl = element2.getAttribute("fullurl");
                version.strMd5 = element2.getAttribute("md5");
                parseFilter(version.filter, element2);
                version.nPeriod = safeGetInt(element2, "period");
                version.version = safeGetInt(element2, ProviderConstants.API_COLNAME_FEATURE_VERSION);
                version.bCanUseCellular = safeGetBoolean(element2, "useCellular");
                version.lowPriority = safeGetBoolean(element2, "lowPriority");
                version.bUseCdn = safeGetBoolean(element2, "useCdn");
                version.versionId = safeGetInt(element2, "versionId");
                version.updateSchedule = element2.getAttribute("updateSchedule");
                version.releaseDate = element2.getAttribute("releaseDate");
                version.updateHourSpeed = element2.getAttribute("updateHourSpeed");
                version.UPDATE_SPEED_CONFIG = element2.getAttribute(CommandDef.COMMAND_UPDATE_SPEED_CONFIG);
                version.UPDATE_FORWARD_SPEED_CONFIG = element2.getAttribute(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG);
                version.UPDATE_SCHEDULE_TIME_RANGE_BIND = element2.getAttribute(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND);
                version.updateStartTime = safeGetFloat(element2, "updateStartTime", -1.0f);
                version.updateEndTime = safeGetFloat(element2, "updateEndTime", -1.0f);
                version.bForbidDownloadWhenNoUin = safeGetBoolean(element2, "forbidDownloadWhenNoUin");
                String attribute = element2.getAttribute("tryUseSharedCore");
                if (attribute != null && !attribute.isEmpty()) {
                    version.bTryUseSharedCore = Boolean.parseBoolean(attribute);
                }
                version.supportPredown = safeGetBoolean(element2, "supportPredown");
                setVersionDes(element2, version.verDes);
                version.patches = getPatches(element2);
                config.versions[i] = version;
            }
        }
    }

    private static boolean safeGetBoolean(Element element, String str) {
        String attribute;
        if (!(element == null || (attribute = element.getAttribute(str)) == null || attribute.isEmpty())) {
            try {
                return Boolean.parseBoolean(attribute);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "safeGetBoolean error", th);
            }
        }
        return false;
    }

    private static double safeGetDouble(Element element, String str, double d) {
        String attribute;
        if (!(element == null || (attribute = element.getAttribute(str)) == null || attribute.isEmpty())) {
            try {
                return Double.parseDouble(attribute);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "safeGetDouble error", th);
            }
        }
        return d;
    }

    private static float safeGetFloat(Element element, String str, float f) {
        String attribute;
        if (!(element == null || (attribute = element.getAttribute(str)) == null || attribute.isEmpty())) {
            try {
                return Float.parseFloat(attribute);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "safeGetFloat error", th);
            }
        }
        return f;
    }

    private static int safeGetInt(Element element, String str) {
        String attribute;
        if (!(element == null || (attribute = element.getAttribute(str)) == null || attribute.isEmpty())) {
            try {
                return Integer.parseInt(attribute);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "safeGetInt error", th);
            }
        }
        return 0;
    }

    private static int safeGetIntFromHex(Element element, String str) {
        String attribute;
        if (!(element == null || (attribute = element.getAttribute(str)) == null || attribute.isEmpty())) {
            if (attribute.contains("0x")) {
                attribute = attribute.trim().substring(2);
            }
            try {
                return Integer.parseInt(attribute, 16);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "safeGetIntFromHex error", th);
            }
        }
        return 0;
    }

    private static void setVersionDes(Element element, ConfigDef.VersionDes versionDes) {
        NodeList elementsByTagName;
        if (versionDes != null && (elementsByTagName = element.getElementsByTagName("Description")) != null && elementsByTagName.getLength() != 0) {
            versionDes.strVersion = ((Element) elementsByTagName.item(0)).getAttribute("versionStr");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.xweb.util.ConfigDef.Config parse(java.io.File r8, java.lang.String r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parse base config, file:"
            r0.append(r1)
            java.lang.String r1 = r8.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConfigParser"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ ParserConfigurationException -> 0x00e0, SAXException -> 0x00c9, IOException -> 0x00b2 }
            r3.<init>(r8)     // Catch:{ ParserConfigurationException -> 0x00e0, SAXException -> 0x00c9, IOException -> 0x00b2 }
            com.tencent.xweb.util.ConfigDef$Config r8 = new com.tencent.xweb.util.ConfigDef$Config     // Catch:{ ParserConfigurationException -> 0x00ac, SAXException -> 0x00a8, IOException -> 0x00a4, all -> 0x00a1 }
            r8.<init>()     // Catch:{ ParserConfigurationException -> 0x00ac, SAXException -> 0x00a8, IOException -> 0x00a4, all -> 0x00a1 }
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            org.w3c.dom.Document r0 = r0.parse(r3)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            org.w3c.dom.Element r0 = r0.getDocumentElement()     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r9 = "parse config failed, xml is corrupted"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x0040:
            java.lang.String r4 = "checkvalue"
            java.lang.String r4 = r0.getAttribute(r4)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            r8.strMd5 = r4     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r4 = "signature"
            java.lang.String r4 = r0.getAttribute(r4)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            r8.signature = r4     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r4 = r8.strMd5     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            r5 = 1
            if (r4 == 0) goto L_0x008d
            boolean r9 = r4.equalsIgnoreCase(r9)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            if (r9 != 0) goto L_0x005d
            goto L_0x008d
        L_0x005d:
            java.lang.String r9 = r8.strMd5     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r4 = r8.signature     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r6 = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn"
            boolean r9 = com.tencent.xweb.util.ECCUtil.verifySHA1withECDSA(r9, r4, r6)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            if (r9 != 0) goto L_0x0077
            r6 = 95
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r6, r5)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r9 = "parse config failed, signature not match"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x0077:
            java.lang.String r9 = "configVer"
            java.lang.String r9 = r0.getAttribute(r9)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            r8.strConfigVer = r9     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            com.tencent.xweb.util.ConfigDef$Command[] r9 = parseCommandList(r0)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            r8.commands = r9     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            parseVersionInfos(r8, r0)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            goto L_0x00f9
        L_0x008d:
            r6 = 34
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r6, r5)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            java.lang.String r9 = "parse config failed, checkValue not match"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ ParserConfigurationException -> 0x009f, SAXException -> 0x009d, IOException -> 0x009b, all -> 0x00a1 }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x009b:
            r9 = move-exception
            goto L_0x00a6
        L_0x009d:
            r9 = move-exception
            goto L_0x00aa
        L_0x009f:
            r9 = move-exception
            goto L_0x00ae
        L_0x00a1:
            r8 = move-exception
            r2 = r3
            goto L_0x00fa
        L_0x00a4:
            r9 = move-exception
            r8 = r2
        L_0x00a6:
            r2 = r3
            goto L_0x00b4
        L_0x00a8:
            r9 = move-exception
            r8 = r2
        L_0x00aa:
            r2 = r3
            goto L_0x00cb
        L_0x00ac:
            r9 = move-exception
            r8 = r2
        L_0x00ae:
            r2 = r3
            goto L_0x00e2
        L_0x00b0:
            r8 = move-exception
            goto L_0x00fa
        L_0x00b2:
            r9 = move-exception
            r8 = r2
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "parse config failed, IOException:"
            r0.append(r3)     // Catch:{ all -> 0x00b0 }
            r0.append(r9)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00b0 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ all -> 0x00b0 }
            goto L_0x00f6
        L_0x00c9:
            r9 = move-exception
            r8 = r2
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "parse config failed, SAXException:"
            r0.append(r3)     // Catch:{ all -> 0x00b0 }
            r0.append(r9)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00b0 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ all -> 0x00b0 }
            goto L_0x00f6
        L_0x00e0:
            r9 = move-exception
            r8 = r2
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "parse config failed, ParserConfigurationException:"
            r0.append(r3)     // Catch:{ all -> 0x00b0 }
            r0.append(r9)     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00b0 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r9)     // Catch:{ all -> 0x00b0 }
        L_0x00f6:
            com.tencent.xweb.util.FileUtils.tryClose(r2)
        L_0x00f9:
            return r8
        L_0x00fa:
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ConfigParser.parse(java.io.File, java.lang.String):com.tencent.xweb.util.ConfigDef$Config");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.tencent.xweb.util.ConfigDef.PluginConfig parsePluginConfig(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parse plugin config, file:"
            r0.append(r1)
            java.lang.String r1 = r6.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConfigParser"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ ParserConfigurationException -> 0x00db, SAXException -> 0x00c4, IOException -> 0x00ad }
            r3.<init>(r6)     // Catch:{ ParserConfigurationException -> 0x00db, SAXException -> 0x00c4, IOException -> 0x00ad }
            com.tencent.xweb.util.ConfigDef$PluginConfig r6 = new com.tencent.xweb.util.ConfigDef$PluginConfig     // Catch:{ ParserConfigurationException -> 0x00a7, SAXException -> 0x00a3, IOException -> 0x009f, all -> 0x009c }
            r6.<init>()     // Catch:{ ParserConfigurationException -> 0x00a7, SAXException -> 0x00a3, IOException -> 0x009f, all -> 0x009c }
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            org.w3c.dom.Document r0 = r0.parse(r3)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            org.w3c.dom.Element r0 = r0.getDocumentElement()     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            if (r0 != 0) goto L_0x0040
            java.lang.String r7 = "parse plugin config failed, xml is corrupted"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x0040:
            java.lang.String r4 = "checkvalue"
            java.lang.String r4 = r0.getAttribute(r4)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            r6.strMd5 = r4     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            java.lang.String r4 = "signature"
            java.lang.String r4 = r0.getAttribute(r4)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            r6.signature = r4     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            java.lang.String r4 = r6.strMd5     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            if (r4 == 0) goto L_0x008d
            boolean r7 = r4.equalsIgnoreCase(r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            if (r7 != 0) goto L_0x005c
            goto L_0x008d
        L_0x005c:
            java.lang.String r7 = r6.strMd5     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            java.lang.String r4 = r6.signature     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            java.lang.String r5 = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn"
            boolean r7 = com.tencent.xweb.util.ECCUtil.verifySHA1withECDSA(r7, r4, r5)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            if (r7 != 0) goto L_0x0077
            r4 = 95
            r7 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            java.lang.String r7 = "parse plugin config failed, signature not match"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x0077:
            java.lang.String r7 = "configVer"
            java.lang.String r7 = r0.getAttribute(r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            r6.strConfigVer = r7     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            com.tencent.xweb.util.ConfigDef$Command[] r7 = parseCommandList(r0)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            r6.commands = r7     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            parsePluginInfos(r6, r0)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            goto L_0x00f4
        L_0x008d:
            java.lang.String r7 = "parse plugin config failed, checkValue not match"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ ParserConfigurationException -> 0x009a, SAXException -> 0x0098, IOException -> 0x0096, all -> 0x009c }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r2
        L_0x0096:
            r7 = move-exception
            goto L_0x00a1
        L_0x0098:
            r7 = move-exception
            goto L_0x00a5
        L_0x009a:
            r7 = move-exception
            goto L_0x00a9
        L_0x009c:
            r6 = move-exception
            r2 = r3
            goto L_0x00f5
        L_0x009f:
            r7 = move-exception
            r6 = r2
        L_0x00a1:
            r2 = r3
            goto L_0x00af
        L_0x00a3:
            r7 = move-exception
            r6 = r2
        L_0x00a5:
            r2 = r3
            goto L_0x00c6
        L_0x00a7:
            r7 = move-exception
            r6 = r2
        L_0x00a9:
            r2 = r3
            goto L_0x00dd
        L_0x00ab:
            r6 = move-exception
            goto L_0x00f5
        L_0x00ad:
            r7 = move-exception
            r6 = r2
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "parse plugin config failed, IOException:"
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            r0.append(r7)     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00ab }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ all -> 0x00ab }
            goto L_0x00f1
        L_0x00c4:
            r7 = move-exception
            r6 = r2
        L_0x00c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "parse plugin config failed, SAXException:"
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            r0.append(r7)     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00ab }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ all -> 0x00ab }
            goto L_0x00f1
        L_0x00db:
            r7 = move-exception
            r6 = r2
        L_0x00dd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "parse plugin config failed, ParserConfigurationException:"
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            r0.append(r7)     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00ab }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r7)     // Catch:{ all -> 0x00ab }
        L_0x00f1:
            com.tencent.xweb.util.FileUtils.tryClose(r2)
        L_0x00f4:
            return r6
        L_0x00f5:
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ConfigParser.parsePluginConfig(java.io.File, java.lang.String):com.tencent.xweb.util.ConfigDef$PluginConfig");
    }
}
