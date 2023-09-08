package com.tencent.p014mm.plugin.ext.openapi.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import c30.C104289g;
import cd3.C39944a;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import f40.C86709a0;
import ft3.C116895f;
import gy3.C87412m;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kr0.C34012r0;
import kr0.C76629w0;
import mb0.C10773b;
import p977hj.C87526a;
import ra1.C47958b;
import sa1.C36646a;
import sa1.C36647b;

/* renamed from: com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi */
public class ExtControlProviderOpenApi extends ExtContentProviderBase {

    /* renamed from: t */
    public static final String[] f269478t = {"retCode", "selfId"};

    /* renamed from: u */
    public static final String[] f269479u = {"retCode", "sportConfig"};

    /* renamed from: v */
    public static final String[] f269480v = {Scopes.OPEN_ID, "avatar"};

    /* renamed from: w */
    public static final String[] f269481w = {"voiceType", "sampleRateInHz", "channelConfig", "audioFormat", AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH};

    /* renamed from: x */
    public static final String[] f269482x = {"username", "appId", "versionType", "nickname", "shortNickname", "iconURL", "collection", "runningFlag", "wechatPkg", "action", "intentInfo"};

    /* renamed from: y */
    public static final String[] f269483y = {XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "nickname", "iconURL"};

    /* renamed from: o */
    public MMHandler f269484o;

    /* renamed from: p */
    public String[] f269485p;

    /* renamed from: q */
    public String f269486q;

    /* renamed from: r */
    public int f269487r;

    /* renamed from: s */
    public Context f269488s;

    public ExtControlProviderOpenApi(String[] strArr, int i, Context context, String str) {
        this.f269485p = strArr;
        this.f269487r = i;
        this.f269488s = context;
        this.f269486q = str;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: l */
    public final Cursor mo128162l(String[] strArr, boolean z) {
        MatrixCursor matrixCursor;
        String str;
        Bundle extras;
        String[] strArr2 = strArr;
        Class cls = C68585h1.class;
        Class cls2 = C68587i1.class;
        char c = 2;
        if (strArr2 == null || strArr2.length < 2) {
            Log.m105928w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
            return C39944a.m42754a(2);
        }
        if (z) {
            String[] strArr3 = f269483y;
        } else {
            matrixCursor = new MatrixCursor(f269482x);
        }
        try {
            int parseInt = Integer.parseInt(strArr2[0]);
            int parseInt2 = Integer.parseInt(strArr2[1]);
            List<LocalUsageInfo> Xs = 1 == parseInt ? z ? ((C68587i1) C86312j.m106911c(cls2)).mo94249Xs(parseInt2, 0) : ((C68587i1) C86312j.m106911c(cls2)).Oe0(parseInt2) : 2 == parseInt ? z ? ((C68585h1) C86312j.m106911c(cls)).tl0(parseInt2, (C68585h1.C68586a) null, 0) : ((C68585h1) C86312j.m106911c(cls)).mo94245pM(parseInt2, (C68585h1.C68586a) null) : null;
            if (Xs == null) {
                Xs = Collections.emptyList();
            }
            for (LocalUsageInfo next : Xs) {
                WxaAttributes XX = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106881XX(next.f239041e);
                if (XX != null) {
                    if (!z) {
                        String[] strArr4 = new String[3];
                        strArr4[0] = XX.field_roundedSquareIconURL;
                        strArr4[1] = XX.field_brandIconURL;
                        strArr4[c] = XX.field_bigHeadURL;
                        Intent Dp0 = ((C10773b) C86312j.m106911c(C10773b.class)).Dp0(MMApplicationContext.getPackageName(), next.f239042f, XX.field_username, XX.field_nickname, strArr4, XX.field_appId, C86709a0.m107523b().mo121110g(), 3);
                        if (!(Dp0 == null || (extras = Dp0.getExtras()) == null)) {
                            HashMap hashMap = new HashMap();
                            for (String next2 : extras.keySet()) {
                                hashMap.put(next2, extras.get(next2));
                            }
                            matrixCursor.addRow(new Object[]{next.f239040d, next.f239041e, Integer.valueOf(next.f239042f), next.f239044h, next.f239045i, XX.field_brandIconURL, Integer.valueOf(next.f239047n ? 1 : 0), Long.valueOf(next.f239048o), Dp0.getPackage(), Dp0.getAction(), new C104289g((Map) hashMap).toString()});
                        }
                    } else {
                        byte[] bytes = (next.f239040d + "," + C86709a0.m107523b().mo121110g() + "," + this.f269494g).getBytes();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(bytes);
                            str = String.format("%064x", new Object[]{new BigInteger(1, instance.digest())});
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        C36646a yx02 = C47958b.yx0();
                        String str2 = next.f239040d;
                        int g = C86709a0.m107523b().mo121110g();
                        String str3 = this.f269494g;
                        yx02.getClass();
                        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                        C87412m.m108594g(str2, "userName");
                        C87412m.m108594g(str3, "appid");
                        Cursor query = C86709a0.m107535s().f251811i.query(yx02.getTableName(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                        C116895f.m164891c("ManufacturerWxaTokenInfoStorage", "" + query.getColumnNames());
                        C36647b bVar = new C36647b();
                        bVar.field_token = str;
                        bVar.field_username = str2;
                        bVar.field_uin = g;
                        bVar.field_appid = str3;
                        C36647b bVar2 = new C36647b();
                        bVar2.field_token = str;
                        if (!yx02.get(bVar2, new String[0])) {
                            bVar2 = null;
                        }
                        if (bVar2 != null) {
                            yx02.update(bVar, new String[0]);
                        } else {
                            yx02.insert(bVar);
                        }
                        matrixCursor.addRow(new Object[]{str, next.f239044h, XX.field_brandIconURL});
                    }
                    c = 2;
                }
            }
            C115669n.INSTANCE.mo160131h(18601, this.f269494g, Integer.valueOf(parseInt), Integer.valueOf(matrixCursor.getCount()));
            return matrixCursor;
        } catch (NumberFormatException e) {
            Log.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", e, "", new Object[0]);
            return C39944a.m42754a(2);
        }
    }

    /* renamed from: m */
    public final Cursor mo128163m(String[] strArr) {
        Class cls = C34012r0.class;
        if (strArr == null || strArr.length == 0) {
            Log.m105928w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
            return C39944a.m42754a(2);
        }
        try {
            int parseInt = Integer.parseInt(strArr[0]);
            if (1 == parseInt) {
                try {
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    if (1 != parseInt2 && 2 != parseInt2 && parseInt2 != 0) {
                        return C39944a.m42754a(2);
                    }
                    ((C34012r0) C86312j.m106911c(cls)).mo56899dn(this.f269488s, parseInt2, this.f269486q);
                } catch (NumberFormatException e) {
                    Log.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", e, "", new Object[0]);
                    return C39944a.m42754a(2);
                }
            } else if (2 != parseInt) {
                return C39944a.m42754a(2);
            } else {
                ((C34012r0) C86312j.m106911c(cls)).mo56898Nx(this.f269488s, this.f269486q);
            }
            return C39944a.m42754a(1);
        } catch (NumberFormatException e2) {
            Log.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", e2, "", new Object[0]);
            return C39944a.m42754a(2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b8  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo128164n(java.lang.String[] r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            com.tencent.mm.plugin.ext.qrcode.f r2 = com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117948b()
            android.content.Context r3 = r1.f269488s
            r2.f269573a = r3
            r2 = 4201(0x1069, float:5.887E-42)
            java.lang.String r3 = "MicroMsg.ExtControlProviderOpenApi"
            if (r0 == 0) goto L_0x04b5
            int r4 = r0.length
            r5 = 1
            if (r4 >= r5) goto L_0x0018
            goto L_0x04b5
        L_0x0018:
            r4 = 0
            r6 = r0[r4]
            r7 = -1
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)
            r8 = 3
            r9 = 2
            if (r6 < 0) goto L_0x04a5
            if (r6 == 0) goto L_0x002c
            if (r6 == r5) goto L_0x002c
            if (r6 == r9) goto L_0x002c
            goto L_0x04a5
        L_0x002c:
            r2 = 4208(0x1070, float:5.897E-42)
            r10 = 4205(0x106d, float:5.892E-42)
            r11 = 0
            if (r6 == 0) goto L_0x0039
            if (r6 != r5) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r0 = r11
            r12 = r0
            goto L_0x005b
        L_0x0039:
            int r12 = r0.length
            if (r12 >= r9) goto L_0x0046
            java.lang.String r0 = "hy: invalid arg length when check or open!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            return r0
        L_0x0046:
            r12 = r0[r5]
            if (r6 != r5) goto L_0x005a
            int r13 = r0.length
            if (r13 >= r8) goto L_0x0057
            java.lang.String r0 = "hy: not providing md5!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            return r0
        L_0x0057:
            r0 = r0[r9]
            goto L_0x005b
        L_0x005a:
            r0 = r11
        L_0x005b:
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r8[r4] = r13
            r8[r5] = r12
            java.lang.String r13 = "hy: cmdid: %d, yuvHandle: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r8)
            java.lang.String r3 = "hy: fastjudge wechat cannot open: %s"
            java.lang.String r8 = "hy: not resolved model"
            java.lang.String r13 = "hy: handled previously. yuvhandle: %s, url: %s. direct return"
            java.lang.String r14 = "MicroMsg.ExtQrCodeHandler"
            if (r6 == 0) goto L_0x01e9
            if (r6 == r5) goto L_0x008f
            if (r6 == r9) goto L_0x0079
            return r11
        L_0x0079:
            com.tencent.mm.plugin.ext.qrcode.f r0 = com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117948b()
            r0.getClass()
            java.lang.String r0 = "hy: release temp mapping"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.ext.qrcode.f$b> r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269552e
            r0.clear()
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r5)
            return r0
        L_0x008f:
            com.tencent.mm.plugin.ext.qrcode.f r6 = com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117948b()
            r6.getClass()
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r17 == 0) goto L_0x00aa
            java.lang.String r0 = "hy: null handle in doHandleOpenQrCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r10)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            goto L_0x01e8
        L_0x00aa:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.ext.qrcode.f$b> r10 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269552e
            java.lang.Object r10 = r10.get(r12)
            com.tencent.mm.plugin.ext.qrcode.f$b r10 = (com.tencent.p014mm.plugin.ext.qrcode.C93387f.C93389b) r10
            if (r10 == 0) goto L_0x00c7
            java.lang.String r15 = r10.f269576b
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x00c7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r4] = r12
            r0[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r0)
            goto L_0x013d
        L_0x00c7:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 == 0) goto L_0x00db
            java.lang.String r0 = "hy: md5 not correct!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r2)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            goto L_0x01e8
        L_0x00db:
            android.util.SparseArray<byte[]> r2 = com.tencent.p014mm.plugin.ext.qrcode.C93383d.f269564a
            com.tencent.mm.plugin.ext.qrcode.d$a r2 = new com.tencent.mm.plugin.ext.qrcode.d$a
            r2.<init>()
            com.tencent.mm.plugin.ext.qrcode.d$b r2 = r2.mo128187a(r12, r5)
            if (r2 != 0) goto L_0x00f8
            java.lang.String r0 = "hy: not retrieved yuv data in doHandleOpenQrCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = 4206(0x106e, float:5.894E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x01e8
        L_0x00f8:
            java.lang.String r9 = r2.f269570f
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0110
            java.lang.String r0 = "hy: cannot retrieve md5 from yuv!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = 4210(0x1072, float:5.9E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x01e8
        L_0x0110:
            java.lang.String r9 = r2.f269570f
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "hy: yuv data not match!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = 4209(0x1071, float:5.898E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x01e8
        L_0x0128:
            com.tencent.mm.plugin.ext.qrcode.f$b r10 = r6.mo128190d(r2)
            if (r10 == 0) goto L_0x01dc
            java.lang.String r0 = r10.f269576b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0138
            goto L_0x01dc
        L_0x0138:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.ext.qrcode.f$b> r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269552e
            r0.put(r12, r10)
        L_0x013d:
            int r0 = r10.f269575a
            r2 = 19
            if (r0 != r2) goto L_0x0163
            java.lang.String r0 = r10.f269576b
            boolean r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.m117940a(r0)
            if (r0 == 0) goto L_0x0163
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r10.f269576b
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            java.lang.String r0 = r10.f269576b
            int r2 = r10.f269575a
            r3 = 4207(0x106f, float:5.895E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r0, r2, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
            goto L_0x01e8
        L_0x0163:
            java.lang.String r0 = "hy: do open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r10.toString()
            r0[r4] = r2
            java.lang.String r2 = "hy: start open: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r6.f269573a
            java.lang.Class<com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI> r3 = com.tencent.p014mm.plugin.ext.p043ui.RedirectToQrCodeStubUI.class
            r0.<init>(r2, r3)
            java.lang.String r2 = r10.f269576b
            java.lang.String r3 = "K_STR"
            r0.putExtra(r3, r2)
            int r2 = r10.f269575a
            java.lang.String r3 = "K_TYPE"
            r0.putExtra(r3, r2)
            int r2 = r10.f269577c
            java.lang.String r3 = "K_VERSION"
            r0.putExtra(r3, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            android.content.Context r2 = r6.f269573a
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/ext/qrcode/ExtQrCodeHandler"
            java.lang.String r14 = "handleOpen"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/ext/qrcode/ExtQrCodeHandler$QrCodeModel;)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r3.mo10231a(r4)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/ext/qrcode/ExtQrCodeHandler"
            java.lang.String r13 = "handleOpen"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/ext/qrcode/ExtQrCodeHandler$QrCodeModel;)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r10.f269576b
            int r2 = r10.f269575a
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r0, r2, r5)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r5)
            goto L_0x01e8
        L_0x01dc:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r8)
            r0 = 4203(0x106b, float:5.89E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117949c(r11, r7, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x01e8:
            return r0
        L_0x01e9:
            com.tencent.mm.plugin.ext.qrcode.f r2 = com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117948b()
            r2.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 == 0) goto L_0x0204
            java.lang.String r0 = "hy: null handle in doHandleCheckQrCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r11, r7, r10)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            goto L_0x04a4
        L_0x0204:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.ext.qrcode.f$b> r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269552e
            java.lang.Object r0 = r0.get(r12)
            com.tencent.mm.plugin.ext.qrcode.f$b r0 = (com.tencent.p014mm.plugin.ext.qrcode.C93387f.C93389b) r0
            if (r0 == 0) goto L_0x0221
            java.lang.String r6 = r0.f269576b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0221
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r4] = r12
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r6)
        L_0x021f:
            r6 = r0
            goto L_0x024e
        L_0x0221:
            android.util.SparseArray<byte[]> r0 = com.tencent.p014mm.plugin.ext.qrcode.C93383d.f269564a
            com.tencent.mm.plugin.ext.qrcode.d$a r0 = new com.tencent.mm.plugin.ext.qrcode.d$a
            r0.<init>()
            com.tencent.mm.plugin.ext.qrcode.d$b r0 = r0.mo128187a(r12, r4)
            if (r0 != 0) goto L_0x023e
            java.lang.String r0 = "hy: not retrieved yuv data in doHandleCheckQrCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = 4206(0x106e, float:5.894E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r11, r7, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x04a4
        L_0x023e:
            com.tencent.mm.plugin.ext.qrcode.f$b r0 = r2.mo128190d(r0)
            if (r0 == 0) goto L_0x049b
            java.lang.String r6 = r0.f269576b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x021f
            goto L_0x049b
        L_0x024e:
            int r0 = r6.f269575a
            r7 = 19
            if (r0 != r7) goto L_0x0490
            java.lang.String r0 = r6.f269576b
            boolean r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.m117940a(r0)
            if (r0 == 0) goto L_0x027a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r6.f269576b
            java.lang.String r2 = r2.toUpperCase()
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            java.lang.String r0 = r6.f269576b
            int r2 = r6.f269575a
            r3 = 4207(0x106f, float:5.895E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r0, r2, r3)
            java.lang.String r0 = r6.f269576b
            android.database.MatrixCursor r0 = cd3.C39944a.m42755b(r3, r0)
            goto L_0x04a4
        L_0x027a:
            java.lang.String r0 = r6.f269576b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r7 = "MicroMsg.ExtQbarDataManager"
            if (r3 == 0) goto L_0x028a
            java.lang.String r0 = "hy: null in fastJudgeInWhitelist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x029d
        L_0x028a:
            java.util.HashSet<java.lang.String> r3 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269548a
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x029d
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r0
            java.lang.String r0 = "hy: %s already in whitelist"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r3)
            r0 = 1
            goto L_0x029e
        L_0x029d:
            r0 = 0
        L_0x029e:
            if (r0 == 0) goto L_0x02b8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r6.f269576b
            r0[r4] = r2
            java.lang.String r2 = "hy: wechat can open: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
            java.lang.String r0 = r6.f269576b
            int r2 = r6.f269575a
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r0, r2, r5)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r5)
            goto L_0x04a4
        L_0x02b8:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r3 = r6.f269576b
            java.lang.String r8 = "\\."
            com.tencent.mm.plugin.ext.qrcode.c r12 = com.tencent.p014mm.plugin.ext.qrcode.C93382c.NONE
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = "hy: url is null when get config"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x02cd:
            r28 = r12
            goto L_0x03c0
        L_0x02d1:
            java.util.ArrayList<com.tencent.mm.plugin.ext.qrcode.a> r0 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269550c
            java.util.Iterator r13 = r0.iterator()
        L_0x02d7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02cd
            java.lang.Object r0 = r13.next()
            com.tencent.mm.plugin.ext.qrcode.a r0 = (com.tencent.p014mm.plugin.ext.qrcode.C93380a) r0
            com.tencent.mm.plugin.ext.qrcode.b r15 = r0.f269553a
            com.tencent.mm.plugin.ext.qrcode.b r9 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.PREFIX
            if (r15 != r9) goto L_0x0306
            java.lang.String r9 = r0.f269555c
            boolean r9 = r3.startsWith(r9)
            if (r9 == 0) goto L_0x0300
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r8 = r0.f269555c
            r3[r4] = r8
            java.lang.String r8 = "hy: match prefix: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            com.tencent.mm.plugin.ext.qrcode.c r12 = r0.f269554b
            goto L_0x03c2
        L_0x0300:
            r29 = r8
            r28 = r12
            goto L_0x03b7
        L_0x0306:
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x03a7 }
            r9.<init>(r3)     // Catch:{ MalformedURLException -> 0x03a7 }
            java.lang.String r9 = r9.getHost()     // Catch:{ MalformedURLException -> 0x03a7 }
            java.lang.String r15 = "hy: host is %s"
            r28 = r12
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x03a3 }
            r12[r4] = r9     // Catch:{ MalformedURLException -> 0x03a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r15, r12)     // Catch:{ MalformedURLException -> 0x03a3 }
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ MalformedURLException -> 0x03a3 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r12)     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r12 == 0) goto L_0x0329
            java.lang.String r0 = "hy: no valid host"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)     // Catch:{ MalformedURLException -> 0x03a3 }
            goto L_0x0396
        L_0x0329:
            com.tencent.mm.plugin.ext.qrcode.b r12 = r0.f269553a     // Catch:{ MalformedURLException -> 0x03a3 }
            com.tencent.mm.plugin.ext.qrcode.b r15 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.DOMAIN     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r12 != r15) goto L_0x0346
            java.lang.String r12 = r0.f269555c     // Catch:{ MalformedURLException -> 0x03a3 }
            boolean r9 = r12.equals(r9)     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r9 == 0) goto L_0x0396
            java.lang.String r9 = "hy: match domain: %s"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x03a3 }
            com.tencent.mm.plugin.ext.qrcode.b r15 = r0.f269553a     // Catch:{ MalformedURLException -> 0x03a3 }
            r12[r4] = r15     // Catch:{ MalformedURLException -> 0x03a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r12)     // Catch:{ MalformedURLException -> 0x03a3 }
            com.tencent.mm.plugin.ext.qrcode.c r12 = r0.f269554b     // Catch:{ MalformedURLException -> 0x03a3 }
            goto L_0x03c2
        L_0x0346:
            com.tencent.mm.plugin.ext.qrcode.b r15 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.SUBDOMAIN     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r12 != r15) goto L_0x0399
            java.lang.String r12 = r0.f269555c     // Catch:{ MalformedURLException -> 0x03a3 }
            java.lang.String[] r12 = r12.split(r8)     // Catch:{ MalformedURLException -> 0x03a3 }
            java.lang.String[] r9 = r9.split(r8)     // Catch:{ MalformedURLException -> 0x03a3 }
            int r15 = r12.length     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r15 <= 0) goto L_0x0396
            int r15 = r9.length     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r15 <= 0) goto L_0x0396
            int r15 = r12.length     // Catch:{ MalformedURLException -> 0x03a3 }
            int r4 = r9.length     // Catch:{ MalformedURLException -> 0x03a3 }
            if (r15 > r4) goto L_0x0396
            int r4 = r12.length     // Catch:{ MalformedURLException -> 0x03a3 }
            int r4 = r4 - r5
            int r15 = r9.length     // Catch:{ MalformedURLException -> 0x03a3 }
            int r15 = r15 - r5
            r18 = 1
        L_0x0364:
            if (r4 < 0) goto L_0x037f
            if (r15 >= 0) goto L_0x0369
            goto L_0x037f
        L_0x0369:
            r5 = r12[r4]     // Catch:{ MalformedURLException -> 0x03a3 }
            r29 = r8
            r8 = r9[r15]     // Catch:{ MalformedURLException -> 0x03a1 }
            boolean r5 = r5.equals(r8)     // Catch:{ MalformedURLException -> 0x03a1 }
            if (r5 != 0) goto L_0x0377
            r18 = 0
        L_0x0377:
            int r4 = r4 + -1
            int r15 = r15 + -1
            r8 = r29
            r5 = 1
            goto L_0x0364
        L_0x037f:
            r29 = r8
            if (r18 == 0) goto L_0x03b7
            java.lang.String r4 = "hy: match %s subdomain: %s"
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x03a1 }
            r5 = 0
            r8[r5] = r3     // Catch:{ MalformedURLException -> 0x03a1 }
            java.lang.String r5 = r0.f269555c     // Catch:{ MalformedURLException -> 0x03a1 }
            r9 = 1
            r8[r9] = r5     // Catch:{ MalformedURLException -> 0x03a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r8)     // Catch:{ MalformedURLException -> 0x03a1 }
            com.tencent.mm.plugin.ext.qrcode.c r12 = r0.f269554b     // Catch:{ MalformedURLException -> 0x03a1 }
            goto L_0x03c2
        L_0x0396:
            r29 = r8
            goto L_0x03b7
        L_0x0399:
            r29 = r8
            java.lang.String r0 = "hy: damn it impossible!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ MalformedURLException -> 0x03a1 }
            goto L_0x03b7
        L_0x03a1:
            r0 = move-exception
            goto L_0x03ac
        L_0x03a3:
            r0 = move-exception
            r29 = r8
            goto L_0x03ac
        L_0x03a7:
            r0 = move-exception
            r29 = r8
            r28 = r12
        L_0x03ac:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r3
            java.lang.String r4 = "hy: error in url convert: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r5)
        L_0x03b7:
            r12 = r28
            r8 = r29
            r4 = 0
            r5 = 1
            r9 = 2
            goto L_0x02d7
        L_0x03c0:
            r12 = r28
        L_0x03c2:
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r12.toString()
            r4 = 0
            r0[r4] = r3
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "hy: resolve config: %s, using: %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            com.tencent.mm.plugin.ext.qrcode.c r0 = com.tencent.p014mm.plugin.ext.qrcode.C93382c.WHITE
            if (r12 != r0) goto L_0x03f5
            java.lang.String r0 = r6.f269576b
            java.util.HashSet<java.lang.String> r2 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269548a
            r2.add(r0)
            java.lang.String r0 = r6.f269576b
            int r2 = r6.f269575a
            r3 = 1
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r0, r2, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
            goto L_0x04a4
        L_0x03f5:
            com.tencent.mm.plugin.ext.qrcode.c r0 = com.tencent.p014mm.plugin.ext.qrcode.C93382c.BLACK
            if (r12 != r0) goto L_0x0402
            java.lang.String r0 = r6.f269576b
            java.util.HashSet<java.lang.String> r2 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269549b
            r2.add(r0)
            r3 = 1
            goto L_0x0474
        L_0x0402:
            java.lang.String r0 = r6.f269576b
            int r3 = r6.f269575a
            int r4 = r6.f269577c
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r5 = 0
            r7[r5] = r0
            java.lang.String r5 = "hy: start remote judge url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r7)
            long r7 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.ext.qrcode.h r5 = new com.tencent.mm.plugin.ext.qrcode.h
            java.lang.Boolean r22 = java.lang.Boolean.TRUE
            r20 = 5000(0x1388, double:2.4703E-320)
            r23 = 1
            r18 = r5
            r19 = r2
            r24 = r0
            r25 = r3
            r26 = r4
            r18.<init>(r19, r20, r22, r23, r24, r25, r26)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r2)
            java.lang.Object r0 = r5.exec(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "hy: can open: %b, using %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x046c
            java.lang.String r0 = r6.f269576b
            java.util.HashSet<java.lang.String> r2 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269548a
            r2.add(r0)
            java.lang.String r0 = r6.f269576b
            int r2 = r6.f269575a
            r3 = 1
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r0, r2, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
            goto L_0x04a4
        L_0x046c:
            r3 = 1
            java.lang.String r0 = r6.f269576b
            java.util.HashSet<java.lang.String> r2 = com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.f269549b
            r2.add(r0)
        L_0x0474:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = r6.f269576b
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "hy: remote wechat cannot open: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r2, r0)
            java.lang.String r0 = r6.f269576b
            int r2 = r6.f269575a
            r3 = 4207(0x106f, float:5.895E-42)
            com.tencent.p014mm.plugin.ext.qrcode.C93387f.m117947a(r0, r2, r3)
            java.lang.String r0 = r6.f269576b
            android.database.MatrixCursor r0 = cd3.C39944a.m42755b(r3, r0)
            goto L_0x04a4
        L_0x0490:
            java.lang.String r0 = "hy: subapp code. can open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r2 = 1
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            goto L_0x04a4
        L_0x049b:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r8)
            r0 = 4203(0x106b, float:5.89E-42)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x04a4:
            return r0
        L_0x04a5:
            java.lang.String r0 = "hy: invalid command!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            r0 = 32
            r3 = 2
            r1.mo128175h(r0, r8, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            return r0
        L_0x04b5:
            java.lang.String r0 = "hy: invalid arg length!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.mo128164n(java.lang.String[], java.lang.String):android.database.Cursor");
    }

    /* renamed from: o */
    public final void mo128165o() {
        C85801v1 wx02 = C47958b.wx0();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_SPORT_PKGNAME_STRING;
        String str = (String) wx02.mo119685f(aVar, (Object) null);
        String b = mo128169b();
        Log.m105925i("MicroMsg.ExtControlProviderOpenApi", "setSportBroadPkg: pkgNames: %s, pkg: %s", str, b);
        if (str == null) {
            C47958b.wx0().mo119677K(aVar, mo128169b());
        } else if (!C87526a.m108857b(str.split(";"), b)) {
            C85801v1 wx03 = C47958b.wx0();
            wx03.mo119677K(aVar, str + ";" + mo128169b());
        }
    }

    public boolean onCreate() {
        this.f269484o = new MMHandler();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0909  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x09a1  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x09a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r27, java.lang.String[] r28, java.lang.String r29, java.lang.String[] r30, java.lang.String r31) {
        /*
            r26 = this;
            r8 = r26
            r0 = r27
            r7 = r30
            r9 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            int r3 = r8.f269487r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 0
            r2[r10] = r3
            java.lang.String r11 = "MicroMsg.ExtControlProviderOpenApi"
            java.lang.String r3 = "query(), ApiId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r2)
            android.content.Context r2 = r8.f269488s
            int r3 = r8.f269487r
            java.lang.String[] r4 = r8.f269485p
            r8.mo128170c(r0, r2, r3, r4)
            java.lang.String r2 = r8.f269494g
            r3 = 5
            r4 = 3
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "uri == null return code = 5"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r8.mo128177j(r4, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
            return r0
        L_0x003b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r6 = 7
            if (r5 == 0) goto L_0x004f
            java.lang.String r0 = "AppID == null return code = 7"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r8.mo128177j(r4, r6)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r6)
            return r0
        L_0x004f:
            java.lang.String r5 = r26.mo128169b()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r12 = 6
            if (r5 == 0) goto L_0x0067
            java.lang.String r0 = "PkgName == null return code = 6"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r8.mo128177j(r4, r12)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r12)
            return r0
        L_0x0067:
            boolean r5 = r26.mo128168a()
            if (r5 != 0) goto L_0x007b
            java.lang.String r0 = "not login return code = 3"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r8.mo128177j(r9, r4)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r4)
            return r0
        L_0x007b:
            int r5 = r26.mo128173f()
            r13 = 2
            if (r5 == r9) goto L_0x009e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid appid ! return code = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r8.mo128177j(r13, r5)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r5)
            return r0
        L_0x009e:
            int r5 = r8.f269487r
            java.lang.String r14 = "return  code =%s "
            r6 = 22
            r12 = 0
            r15 = 4
            if (r5 == r6) goto L_0x0774
            r0 = 23
            if (r5 == r0) goto L_0x0658
            r3 = 25
            r16 = 0
            r6 = 8
            if (r5 == r3) goto L_0x0545
            r1 = 46
            if (r5 == r1) goto L_0x04fc
            r1 = 48
            if (r5 == r1) goto L_0x04f7
            r1 = 54
            if (r5 == r1) goto L_0x04d0
            r1 = 56
            if (r5 == r1) goto L_0x04ad
            r1 = 51
            if (r5 == r1) goto L_0x04a7
            r1 = 52
            if (r5 == r1) goto L_0x04a2
            r1 = 15
            r3 = 14
            switch(r5) {
                case 35: goto L_0x0356;
                case 36: goto L_0x02dc;
                case 37: goto L_0x029a;
                case 38: goto L_0x0250;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            switch(r5) {
                case 40: goto L_0x01b0;
                case 41: goto L_0x0154;
                case 42: goto L_0x00db;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            r8.mo128177j(r4, r1)
            return r12
        L_0x00db:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.addFlags(r1)
            java.lang.String r1 = "key_from_scene"
            r0.putExtra(r1, r15)
            if (r7 == 0) goto L_0x010f
            int r1 = r7.length
            if (r1 <= 0) goto L_0x010f
            r1 = r7[r10]
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x010f
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r3 = r7[r10]
            r1[r10] = r3
            r1[r9] = r2
            java.lang.String r3 = "openOffline business_attach:%s,appid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r1)
            r1 = r7[r10]
            java.lang.String r3 = "key_business_attach"
            r0.putExtra(r3, r1)
            goto L_0x0119
        L_0x010f:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r2
            java.lang.String r3 = "openOffline appid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r1)
        L_0x0119:
            java.lang.String r1 = "key_appid"
            r0.putExtra(r1, r2)
            android.content.Context r1 = r8.f269488s
            java.lang.String r2 = "offline"
            java.lang.String r3 = ".ui.WalletOfflineEntranceUI"
            ke3.C88144b.m109791i(r1, r2, r3, r0, r12)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 12097(0x2f41, float:1.6952E-41)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2[r9] = r3
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            r0.mo160131h(r1, r2)
            r0 = 24
            r8.mo128175h(r0, r10, r9)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r9)
            return r0
        L_0x0154:
            java.lang.String r1 = "getSportConfig start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r26.mo128165o()
            com.tencent.mm.autogen.events.ExtStepCountEvent r1 = new com.tencent.mm.autogen.events.ExtStepCountEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ExtStepCountEvent$a r2 = r1.f107516d
            r2.f107518a = r4
            boolean r2 = r1.publish()
            if (r2 == 0) goto L_0x01a8
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r1.f107517e
            boolean r3 = r2.f107523b
            if (r3 == 0) goto L_0x01a8
            java.lang.String r0 = r2.f107522a
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            java.lang.String[] r3 = f269479u
            r2.<init>(r3)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r4 = r1.f107517e
            int r4 = r4.f107524c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r10] = r4
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r3[r9] = r0
            r2.addRow(r3)
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r0 = r1.f107517e
            int r0 = r0.f107524c
            r3 = 22
            r8.mo128175h(r3, r10, r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r1 = r1.f107517e
            int r1 = r1.f107524c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r0)
            goto L_0x01af
        L_0x01a8:
            r8.mo128175h(r0, r15, r6)
            android.database.MatrixCursor r2 = cd3.C39944a.m42754a(r6)
        L_0x01af:
            return r2
        L_0x01b0:
            java.lang.String r1 = "setSportStep start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            if (r7 == 0) goto L_0x0243
            int r1 = r7.length
            if (r1 >= r4) goto L_0x01bd
            goto L_0x0243
        L_0x01bd:
            r1 = r7[r10]
            r2 = -1
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r2)
            r5 = r7[r9]
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r2)
            r5 = r7[r13]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r2)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r12 = 0
            r5[r12] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r12 = 1
            r5[r12] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r5[r13] = r7
            java.lang.String r7 = "setSportStep: timestampe: %s, stepcount: %s,  version: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r7, r5)
            int r5 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x0233
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x0233
            int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x01fa
            goto L_0x0233
        L_0x01fa:
            r26.mo128165o()
            com.tencent.mm.autogen.events.ExtStepCountEvent r4 = new com.tencent.mm.autogen.events.ExtStepCountEvent
            r4.<init>()
            com.tencent.mm.autogen.events.ExtStepCountEvent$a r5 = r4.f107516d
            r5.f107518a = r13
            r5.f107519b = r9
            r5.f107520c = r0
            r5.f107521d = r2
            boolean r0 = r4.publish()
            if (r0 == 0) goto L_0x0229
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r0 = r4.f107517e
            boolean r1 = r0.f107523b
            if (r1 == 0) goto L_0x0229
            int r0 = r0.f107524c
            r1 = 22
            r2 = 0
            r8.mo128175h(r1, r2, r0)
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r0 = r4.f107517e
            int r0 = r0.f107524c
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x024f
        L_0x0229:
            r0 = 23
            r8.mo128175h(r0, r15, r6)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r6)
            goto L_0x024f
        L_0x0233:
            r0 = 23
            java.lang.String r1 = "param err"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r8.mo128175h(r0, r4, r13)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r13)
            goto L_0x024f
        L_0x0243:
            java.lang.String r1 = "args error: args length error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            r8.mo128175h(r0, r4, r13)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r13)
        L_0x024f:
            return r0
        L_0x0250:
            java.lang.String r0 = "connectWifi"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r8.f269484o = r0
            xa1.f r0 = new xa1.f
            r4 = 20000(0x4e20, double:9.8813E-320)
            r6 = 0
            r9 = 1
            r1 = r0
            r2 = r26
            r10 = 14
            r3 = r4
            r5 = r6
            r6 = r9
            r7 = r30
            r1.<init>(r2, r3, r5, r6, r7)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r8.f269484o
            java.lang.Object r0 = r0.exec(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0287
            r0 = 21
            r8.mo128175h(r0, r15, r10)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            goto L_0x0299
        L_0x0287:
            r1 = 20
            int r2 = r0.intValue()
            r3 = 0
            r8.mo128175h(r1, r3, r2)
            int r0 = r0.intValue()
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x0299:
            return r0
        L_0x029a:
            r10 = 14
            java.lang.String r0 = "getWifiList"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r8.f269484o = r0
            xa1.d r0 = new xa1.d
            r3 = 20000(0x4e20, double:9.8813E-320)
            r5 = 0
            r6 = 1
            r1 = r0
            r2 = r26
            r7 = r30
            r1.<init>(r2, r3, r5, r6, r7)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r8.f269484o
            java.lang.Object r0 = r0.exec(r1)
            android.database.MatrixCursor r0 = (android.database.MatrixCursor) r0
            if (r0 != 0) goto L_0x02ce
            r0 = 19
            r8.mo128175h(r0, r15, r10)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            goto L_0x02db
        L_0x02ce:
            r1 = 18
            r2 = 1
            r3 = 0
            r8.mo128175h(r1, r3, r2)
            java.lang.String r1 = "returnMatrix syncTaskCur"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
        L_0x02db:
            return r0
        L_0x02dc:
            java.lang.String r0 = "hy: start redirect to wechat out by phone num"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 == 0) goto L_0x0347
            int r0 = r7.length
            if (r0 >= r4) goto L_0x02e7
            goto L_0x0347
        L_0x02e7:
            r1 = 0
            r0 = r7[r1]
            r2 = 1
            r3 = r7[r2]
            r5 = -1
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r5 = r7[r13]
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r1] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r6[r2] = r1
            r6[r13] = r5
            java.lang.String r1 = "hy: start wechat out: contactid: %s, countrycode: %s,  phone num: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r6)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0338
            if (r3 < 0) goto L_0x0338
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x0314
            goto L_0x0338
        L_0x0314:
            com.tencent.mm.autogen.events.StartIPCallEvent r1 = new com.tencent.mm.autogen.events.StartIPCallEvent
            r1.<init>()
            com.tencent.mm.autogen.events.StartIPCallEvent$a r2 = r1.f79006d
            r2.f79007a = r0
            r2.f79008b = r3
            r2.f79009c = r5
            android.content.Context r3 = r8.f269488s
            java.lang.String r0 = wc3.C15131b.m14239c(r0, r3)
            r2.f79010d = r0
            r1.publish()
            r0 = 16
            r1 = 1
            r2 = 0
            r8.mo128175h(r0, r2, r1)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r1)
            goto L_0x0355
        L_0x0338:
            java.lang.String r0 = "hy: param err"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r0 = 3302(0xce6, float:4.627E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x0355
        L_0x0347:
            java.lang.String r0 = "hy: wechat out args error: args length error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3301(0xce5, float:4.626E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x0355:
            return r0
        L_0x0356:
            r10 = 14
            java.lang.String r0 = "hy: start redirect to chatting by phone num"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 == 0) goto L_0x0493
            int r0 = r7.length
            r2 = 1
            if (r0 < r2) goto L_0x0493
            r3 = 0
            r0 = r7[r3]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x036e
            goto L_0x0493
        L_0x036e:
            r0 = r7[r3]
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r0
            java.lang.String r3 = "hy: start searching for phone num: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r5)
            va1.b r3 = new va1.b
            android.content.Context r5 = r8.f269488s
            r3.<init>(r5, r0, r2)
            java.lang.String r2 = "MicroMsg.RedirectToChattingByPhoneHelper"
            if (r5 != 0) goto L_0x038a
            java.lang.String r0 = "hy: context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x03a7
        L_0x038a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0396
            java.lang.String r0 = "hy: phone is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x03a7
        L_0x0396:
            java.lang.String r0 = r3.f229682a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.PhoneFormater.pureNumber(r0)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x03ab
            java.lang.String r0 = "hy: pure num is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x03a7:
            r2 = 1
            r13 = -1
            goto L_0x0474
        L_0x03ab:
            java.lang.String r5 = r3.f229682a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x03ba
            java.lang.String r5 = "hy: username is null when get from cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            r5 = r12
            goto L_0x03cf
        L_0x03ba:
            java.util.Map<java.lang.String, va1.b$b> r6 = va1.C78377b.f229681d
            if (r6 != 0) goto L_0x03c5
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            va1.C78377b.f229681d = r6
        L_0x03c5:
            java.util.Map<java.lang.String, va1.b$b> r6 = va1.C78377b.f229681d
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r5 = r6.get(r5)
            va1.b$b r5 = (va1.C78377b.C78379b) r5
        L_0x03cf:
            if (r5 == 0) goto L_0x03e3
            java.lang.String r0 = "hy: got from cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r5.f229686a
            te3.mx3 r2 = r5.f229687b
            te3.kx3 r4 = r5.f229688c
            int r13 = r3.mo108335c(r0, r2, r4)
        L_0x03e0:
            r2 = 1
            goto L_0x0474
        L_0x03e3:
            com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent r5 = new com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent
            r5.<init>()
            com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent$a r6 = r5.f78816d
            r6.f78818a = r0
            r5.publish()
            com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent$b r5 = r5.f78817e
            java.lang.String r5 = r5.f78819a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x0409
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r4 = 0
            r0[r4] = r5
            java.lang.String r4 = "hy: has found username: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            int r13 = r3.mo108335c(r5, r12, r12)
            goto L_0x03e0
        L_0x0409:
            java.lang.String r5 = "hy: not found from local storage. Try to find from search"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r5 = 106(0x6a, float:1.49E-43)
            ob0.n r6 = r3.f229684c
            r2.mo123455a(r5, r6)
            d62.l r2 = new d62.l
            r2.<init>(r0, r4)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123460f(r2)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r2 = r3.f229683b
            java.lang.String r4 = "com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI"
            r0.setClassName(r2, r4)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = r3.f229683b
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/ext/model/RedirectToChattingByPhoneHelper"
            java.lang.String r21 = "startDialogUI"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "Undefined"
            java.lang.String r24 = "startActivity"
            java.lang.String r25 = "(Landroid/content/Intent;)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            java.lang.Object r0 = r3.mo10231a(r4)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r19 = "com/tencent/mm/plugin/ext/model/RedirectToChattingByPhoneHelper"
            java.lang.String r20 = "startDialogUI"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03e0
        L_0x0474:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = " ret =  "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r0)
            r0 = -1
            if (r13 == r0) goto L_0x048a
            r8.mo128175h(r10, r3, r13)
            r10 = 0
            goto L_0x048e
        L_0x048a:
            r8.mo128175h(r1, r3, r13)
            r10 = r13
        L_0x048e:
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r10)
            goto L_0x04a1
        L_0x0493:
            java.lang.String r0 = "hy: args error: no phone num or phone num is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3201(0xc81, float:4.486E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x04a1:
            return r0
        L_0x04a2:
            android.database.Cursor r0 = r8.mo128163m(r7)
            return r0
        L_0x04a7:
            r1 = 0
            android.database.Cursor r0 = r8.mo128162l(r7, r1)
            return r0
        L_0x04ad:
            r1 = 0
            if (r7 == 0) goto L_0x04c6
            int r0 = r7.length
            if (r0 != 0) goto L_0x04b4
            goto L_0x04c6
        L_0x04b4:
            java.lang.String[] r0 = new java.lang.String[r13]
            r2 = r7[r1]
            r0[r1] = r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            android.database.Cursor r0 = r8.mo128163m(r0)
            goto L_0x04cf
        L_0x04c6:
            java.lang.String r0 = "hy: invalid arg length!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r13)
        L_0x04cf:
            return r0
        L_0x04d0:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r8.f269484o = r0
            xa1.b r0 = new xa1.b
            r1 = 4302(0x10ce, float:6.028E-42)
            android.database.MatrixCursor r5 = cd3.C39944a.m42754a(r1)
            r3 = 20000(0x4e20, double:9.8813E-320)
            r6 = 1
            r1 = r0
            r2 = r26
            r7 = r30
            r1.<init>(r2, r3, r5, r6, r7)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r8.f269484o
            java.lang.Object r0 = r0.exec(r1)
            android.database.Cursor r0 = (android.database.Cursor) r0
            return r0
        L_0x04f7:
            android.database.Cursor r0 = r8.mo128164n(r7, r12)
            return r0
        L_0x04fc:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r2
            java.lang.String r1 = "openClean appid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r1, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x051f
            r0 = 27
            r1 = 5
            r8.mo128175h(r0, r1, r15)
            r0 = 4101(0x1005, float:5.747E-42)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x0544
        L_0x051f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "key_from_openapi"
            r3 = 1
            r0.putExtra(r1, r3)
            java.lang.String r1 = "key_openapi_appid"
            r0.putExtra(r1, r2)
            android.content.Context r1 = r8.f269488s
            java.lang.String r2 = "clean"
            java.lang.String r4 = ".ui.CleanUI"
            ke3.C88144b.m109791i(r1, r2, r4, r0, r12)
            r0 = 26
            r1 = 0
            r8.mo128175h(r0, r1, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
        L_0x0544:
            return r0
        L_0x0545:
            java.lang.String r0 = "decodeVoice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 == 0) goto L_0x0649
            int r0 = r7.length
            if (r0 <= 0) goto L_0x0649
            r2 = 0
            r0 = r7[r2]
            int r0 = r0.length()
            if (r0 > 0) goto L_0x055a
            goto L_0x0649
        L_0x055a:
            r3 = 0
        L_0x055b:
            r5 = 5
            if (r3 >= r5) goto L_0x0638
            int r0 = r7.length
            if (r3 >= r0) goto L_0x0638
            r0 = r7[r3]
            r5 = 1
            boolean r9 = kd0.C76550x.m92057f(r0, r2, r5)     // Catch:{ Exception -> 0x0624 }
            if (r9 != 0) goto L_0x0579
            java.lang.String r0 = "wrong args : %s"
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0624 }
            r5 = r7[r3]     // Catch:{ Exception -> 0x0624 }
            r9[r2] = r5     // Catch:{ Exception -> 0x0624 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r0, r9)     // Catch:{ Exception -> 0x0624 }
        L_0x0576:
            r2 = 0
            goto L_0x0634
        L_0x0579:
            if (r12 != 0) goto L_0x0583
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x0624 }
            java.lang.String[] r5 = f269481w     // Catch:{ Exception -> 0x0624 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0624 }
            r12 = r2
        L_0x0583:
            kd0.o r2 = new kd0.o     // Catch:{ Exception -> 0x0624 }
            r2.<init>()     // Catch:{ Exception -> 0x0624 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0624 }
            r5.<init>()     // Catch:{ Exception -> 0x0624 }
            boolean r9 = ra1.C47958b.f128650t     // Catch:{ Exception -> 0x0624 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0624 }
            r9.<init>()     // Catch:{ Exception -> 0x0624 }
            f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0624 }
            java.lang.String r10 = r10.f251806d     // Catch:{ Exception -> 0x0624 }
            r9.append(r10)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r10 = "image/ext/pcm"
            r9.append(r10)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0624 }
            r5.append(r9)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r9 = "/"
            r5.append(r9)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ Exception -> 0x0624 }
            r5.append(r9)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0624 }
            java.lang.String r9 = "summerpcm pcmPath[%s]"
            r10 = 1
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0624 }
            r10 = 0
            r14[r10] = r5     // Catch:{ Exception -> 0x0624 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r14)     // Catch:{ Exception -> 0x0624 }
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)     // Catch:{ Exception -> 0x0624 }
            int r14 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x05d5
            java.lang.String r9 = "pcm already exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)     // Catch:{ Exception -> 0x0624 }
            r9 = r5
            goto L_0x05d9
        L_0x05d5:
            java.lang.String r9 = r2.mo33347r(r0, r5)     // Catch:{ Exception -> 0x0624 }
        L_0x05d9:
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)     // Catch:{ Exception -> 0x0624 }
            int r10 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x05e5
            java.lang.String r9 = r2.mo33347r(r0, r5)     // Catch:{ Exception -> 0x0624 }
        L_0x05e5:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0624 }
            if (r0 == 0) goto L_0x05f2
            java.lang.String r0 = "wrong args targetFilePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)     // Catch:{ Exception -> 0x0624 }
            goto L_0x0576
        L_0x05f2:
            java.lang.String r0 = "decode to pcm success %d"
            r5 = 1
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0624 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0624 }
            r14 = 0
            r10[r14] = r5     // Catch:{ Exception -> 0x0624 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r0, r10)     // Catch:{ Exception -> 0x0624 }
            r5 = 5
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0624 }
            r0[r14] = r1     // Catch:{ Exception -> 0x0624 }
            int r5 = r2.f60245g     // Catch:{ Exception -> 0x0624 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0624 }
            r10 = 1
            r0[r10] = r5     // Catch:{ Exception -> 0x0624 }
            int r2 = r2.f60244f     // Catch:{ Exception -> 0x0624 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0624 }
            r0[r13] = r2     // Catch:{ Exception -> 0x0624 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0624 }
            r0[r4] = r2     // Catch:{ Exception -> 0x0624 }
            r0[r15] = r9     // Catch:{ Exception -> 0x0624 }
            r12.addRow(r0)     // Catch:{ Exception -> 0x0624 }
            goto L_0x0576
        L_0x0624:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r5[r2] = r0
            java.lang.String r0 = "Exception in decodeVoice, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r5)
        L_0x0634:
            int r3 = r3 + 1
            goto L_0x055b
        L_0x0638:
            if (r12 == 0) goto L_0x063f
            r1 = 1
            r8.mo128175h(r6, r2, r1)
            goto L_0x0657
        L_0x063f:
            r1 = 9
            r8.mo128175h(r1, r4, r15)
            android.database.MatrixCursor r12 = cd3.C39944a.m42754a(r15)
            goto L_0x0657
        L_0x0649:
            java.lang.String r0 = "decodeVoice wrong args"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3101(0xc1d, float:4.345E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r12 = cd3.C39944a.m42754a(r0)
        L_0x0657:
            return r12
        L_0x0658:
            java.lang.String r0 = "getUserAvatarByOpenId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 == 0) goto L_0x0764
            int r0 = r7.length
            if (r0 > 0) goto L_0x0664
            goto L_0x0764
        L_0x0664:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r0 = f269480v
            r1.<init>(r0)
            r0 = 0
        L_0x066c:
            int r2 = r7.length     // Catch:{ Exception -> 0x0746 }
            if (r0 >= r2) goto L_0x073d
            r2 = 5
            if (r0 >= r2) goto L_0x073d
            r2 = r7[r0]     // Catch:{ Exception -> 0x0746 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0746 }
            if (r2 == 0) goto L_0x067c
            goto L_0x0739
        L_0x067c:
            com.tencent.mm.storage.f5 r2 = ra1.C47958b.Ax0()     // Catch:{ Exception -> 0x0746 }
            r3 = r7[r0]     // Catch:{ Exception -> 0x0746 }
            com.tencent.mm.storage.e5 r2 = r2.mo57647Lo(r3)     // Catch:{ Exception -> 0x0746 }
            if (r2 == 0) goto L_0x0733
            java.lang.String r3 = r2.field_openId     // Catch:{ Exception -> 0x0746 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0746 }
            if (r3 != 0) goto L_0x0733
            java.lang.String r3 = r2.field_username     // Catch:{ Exception -> 0x0746 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0746 }
            if (r3 == 0) goto L_0x069a
            goto L_0x0733
        L_0x069a:
            eb0.c r3 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0746 }
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r2 = r2.field_username     // Catch:{ Exception -> 0x0746 }
            com.tencent.mm.storage.z1 r2 = r3.get(r2)     // Catch:{ Exception -> 0x0746 }
            if (r2 == 0) goto L_0x072d
            java.lang.String r3 = r2.getUsername()     // Catch:{ Exception -> 0x0746 }
            if (r3 == 0) goto L_0x072d
            java.lang.String r3 = r2.getUsername()     // Catch:{ Exception -> 0x0746 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0746 }
            if (r3 > 0) goto L_0x06bb
            goto L_0x072d
        L_0x06bb:
            java.lang.Class<ln.g> r3 = p196ln.C76706g.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0746 }
            ln.g r3 = (p196ln.C76706g) r3     // Catch:{ Exception -> 0x0746 }
            ln.k r3 = r3.mo106826RE()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r4 = r2.getUsername()     // Catch:{ Exception -> 0x0746 }
            com.tencent.mm.modelavatar.AvatarStorage r3 = (com.tencent.p014mm.modelavatar.AvatarStorage) r3     // Catch:{ Exception -> 0x0746 }
            r5 = 0
            java.lang.String r3 = r3.mo93558g(r4, r5, r5)     // Catch:{ Exception -> 0x0746 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0746 }
            if (r4 == 0) goto L_0x06de
            java.lang.String r2 = "hy: get avatar sfs path is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r2)     // Catch:{ Exception -> 0x0746 }
            goto L_0x0739
        L_0x06de:
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r4 = r4.f251807e     // Catch:{ Exception -> 0x0746 }
            boolean r4 = r3.startsWith(r4)     // Catch:{ Exception -> 0x0746 }
            if (r4 == 0) goto L_0x0718
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r4 = r4.f251807e     // Catch:{ Exception -> 0x0746 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0746 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0746 }
            r5.<init>()     // Catch:{ Exception -> 0x0746 }
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r6 = r6.f251806d     // Catch:{ Exception -> 0x0746 }
            r5.append(r6)     // Catch:{ Exception -> 0x0746 }
            java.lang.String r4 = r3.substring(r4)     // Catch:{ Exception -> 0x0746 }
            r5.append(r4)     // Catch:{ Exception -> 0x0746 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0746 }
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106458s(r4)     // Catch:{ Exception -> 0x0746 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r5)     // Catch:{ Exception -> 0x0746 }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r3, r4)     // Catch:{ Exception -> 0x0746 }
            r3 = r4
        L_0x0718:
            java.lang.String r2 = r2.getUsername()     // Catch:{ Exception -> 0x0746 }
            r4 = 0
            com.tencent.p014mm.modelavatar.AvatarStorage.C68077d.m80462a(r3, r2, r4)     // Catch:{ Exception -> 0x0746 }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0746 }
            r5 = r7[r0]     // Catch:{ Exception -> 0x0746 }
            r2[r4] = r5     // Catch:{ Exception -> 0x0746 }
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x0746 }
            r1.addRow(r2)     // Catch:{ Exception -> 0x0746 }
            goto L_0x0739
        L_0x072d:
            java.lang.String r2 = "contact is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)     // Catch:{ Exception -> 0x0746 }
            goto L_0x0739
        L_0x0733:
            java.lang.String r2 = "openidInApp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)     // Catch:{ Exception -> 0x0746 }
        L_0x0739:
            int r0 = r0 + 1
            goto L_0x066c
        L_0x073d:
            r0 = 6
            r2 = 1
            r3 = 0
            r8.mo128175h(r0, r3, r2)     // Catch:{ Exception -> 0x0744 }
            goto L_0x0773
        L_0x0744:
            r0 = move-exception
            goto L_0x0749
        L_0x0746:
            r0 = move-exception
            r2 = 1
            r3 = 0
        L_0x0749:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2[r3] = r0
            java.lang.String r0 = "Exception occur, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r2)
            r2 = 12
            r3 = 7
            r8.mo128175h(r3, r15, r2)
            r1.close()
            android.database.MatrixCursor r1 = cd3.C39944a.m42754a(r2)
            goto L_0x0773
        L_0x0764:
            java.lang.String r0 = "wrong args"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3001(0xbb9, float:4.205E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r1 = cd3.C39944a.m42754a(r0)
        L_0x0773:
            return r1
        L_0x0774:
            java.lang.String r2 = "op"
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = "scene"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r5 = "msgType"
            java.lang.String r5 = r0.getQueryParameter(r5)
            java.lang.String r6 = "msgState"
            java.lang.String r0 = r0.getQueryParameter(r6)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r2
            java.lang.String r6 = "registerMsgReceiver, op = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r7)
            android.content.Context r6 = r8.f269488s
            if (r6 != 0) goto L_0x07b0
            java.lang.String r0 = "context == null return code = 2001"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r8.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x09c9
        L_0x07b0:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 == 0) goto L_0x07c7
            java.lang.String r0 = "wrong args, op is null return code = 2002"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 2002(0x7d2, float:2.805E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x09c9
        L_0x07c7:
            r6 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x07ce }
        L_0x07cc:
            r6 = 1
            goto L_0x07d1
        L_0x07ce:
            r2 = -1
            goto L_0x07cc
        L_0x07d1:
            if (r2 != r6) goto L_0x092d
            java.lang.String r2 = "doRegisterMsgListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x0912
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 != 0) goto L_0x0912
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x07ec
            goto L_0x0912
        L_0x07ec:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x08f2 }
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x08f2 }
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x08f2 }
            if (r0 == r13) goto L_0x081a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08f2 }
            r1.<init>()     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r2 = "wrong msgState: "
            r1.append(r2)     // Catch:{ Exception -> 0x08f2 }
            r1.append(r0)     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x08f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x08f2 }
            r0 = 2005(0x7d5, float:2.81E-42)
            r8.mo128177j(r4, r0)     // Catch:{ Exception -> 0x08f2 }
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)     // Catch:{ Exception -> 0x08f2 }
            goto L_0x09c9
        L_0x081a:
            com.tencent.mm.storage.n4 r5 = ra1.C47958b.zx0()     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r6 = r8.f269494g     // Catch:{ Exception -> 0x08f2 }
            com.tencent.mm.storage.m4 r5 = r5.mo57671jo(r6)     // Catch:{ Exception -> 0x08f2 }
            if (r5 != 0) goto L_0x089a
            com.tencent.mm.storage.m4 r5 = new com.tencent.mm.storage.m4     // Catch:{ Exception -> 0x08f2 }
            r5.<init>()     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r6 = r8.f269494g     // Catch:{ Exception -> 0x08f2 }
            r5.field_appId = r6     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r6 = r26.mo128169b()     // Catch:{ Exception -> 0x08f2 }
            r5.field_packageName = r6     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r6 = r8.f269494g     // Catch:{ Exception -> 0x08f2 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x08f2 }
            if (r7 == 0) goto L_0x083f
            r6 = 0
            goto L_0x0847
        L_0x083f:
            com.tencent.mm.pluginsdk.model.app.j r6 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48987g(r6)     // Catch:{ Exception -> 0x08f2 }
            boolean r6 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48983c(r6)     // Catch:{ Exception -> 0x08f2 }
        L_0x0847:
            if (r6 == 0) goto L_0x084d
            r6 = 1
            r5.field_status = r6     // Catch:{ Exception -> 0x08f2 }
            goto L_0x0850
        L_0x084d:
            r6 = 0
            r5.field_status = r6     // Catch:{ Exception -> 0x08f2 }
        L_0x0850:
            r5.field_sceneFlag = r2     // Catch:{ Exception -> 0x08f2 }
            r5.field_msgTypeFlag = r3     // Catch:{ Exception -> 0x08f2 }
            r5.field_msgState = r0     // Catch:{ Exception -> 0x08f2 }
            com.tencent.mm.storage.n4 r3 = ra1.C47958b.zx0()     // Catch:{ Exception -> 0x08f2 }
            boolean r3 = r3.insert(r5)     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r6 = "registerMsgReceiver ret = %s, pkgName = %s, scene = %s, msgType = %s, msgState = %s, appStatus = %s"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x08f2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x08f2 }
            r10 = 0
            r7[r10] = r9     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r9 = r26.mo128169b()     // Catch:{ Exception -> 0x08f2 }
            r10 = 1
            r7[r10] = r9     // Catch:{ Exception -> 0x08f2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x08f2 }
            r7[r13] = r2     // Catch:{ Exception -> 0x08f2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08f2 }
            r7[r4] = r2     // Catch:{ Exception -> 0x08f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08f2 }
            r7[r15] = r0     // Catch:{ Exception -> 0x08f2 }
            int r0 = r5.field_status     // Catch:{ Exception -> 0x08f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08f2 }
            r2 = 5
            r7[r2] = r0     // Catch:{ Exception -> 0x08f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r7)     // Catch:{ Exception -> 0x08f2 }
            if (r3 != 0) goto L_0x08ad
            r0 = 2006(0x7d6, float:2.811E-42)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)     // Catch:{ Exception -> 0x08f2 }
            goto L_0x09c9
        L_0x089a:
            java.lang.String r0 = "This app had already been registered, appId = %s, pkg = %s"
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r3 = r8.f269494g     // Catch:{ Exception -> 0x08f2 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r3 = r26.mo128169b()     // Catch:{ Exception -> 0x08f2 }
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x08f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r0, r2)     // Catch:{ Exception -> 0x08f2 }
        L_0x08ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08f2 }
            r0.<init>()     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r2 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x08f2 }
            r0.append(r2)     // Catch:{ Exception -> 0x08f2 }
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x08f2 }
            int r2 = r2.mo105881G()     // Catch:{ Exception -> 0x08f2 }
            r0.append(r2)     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08f2 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ Exception -> 0x08f2 }
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x08f2 }
            java.lang.String[] r3 = f269478t     // Catch:{ Exception -> 0x08f2 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x08f2 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x08ef }
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x08ef }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x08ef }
            r5 = 1
            r3[r5] = r0     // Catch:{ Exception -> 0x08ef }
            r2.addRow(r3)     // Catch:{ Exception -> 0x08ef }
            r8.mo128175h(r4, r4, r5)     // Catch:{ Exception -> 0x08ef }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x08ef }
            r0[r4] = r1     // Catch:{ Exception -> 0x08ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r0)     // Catch:{ Exception -> 0x08ef }
            r0 = r2
            goto L_0x09c9
        L_0x08ef:
            r0 = move-exception
            r12 = r2
            goto L_0x08f3
        L_0x08f2:
            r0 = move-exception
        L_0x08f3:
            r1 = 12
            r2 = 1
            r8.mo128175h(r2, r15, r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "exception in doRegisterMsgListener, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r2)
            if (r12 == 0) goto L_0x090c
            r12.close()
        L_0x090c:
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r1)
            goto L_0x09c9
        L_0x0912:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r5
            r1[r13] = r0
            java.lang.String r0 = "wrong args, scene = %s, msgType = %s, msgState = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            r0 = 2004(0x7d4, float:2.808E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x09c9
        L_0x092d:
            if (r2 != r13) goto L_0x09b0
            java.lang.String r0 = "doUnRegisterMsgListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            com.tencent.mm.storage.n4 r0 = ra1.C47958b.zx0()
            java.lang.String r1 = r8.f269494g
            com.tencent.mm.storage.m4 r0 = r0.mo57671jo(r1)
            if (r0 != 0) goto L_0x095a
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r1 = r8.f269494g
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r26.mo128169b()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "This app never been registered, appId = %s, pkg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r1, r0)
            r0 = 2007(0x7d7, float:2.812E-42)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x09c9
        L_0x095a:
            com.tencent.mm.storage.n4 r0 = ra1.C47958b.zx0()
            java.lang.String r1 = r8.f269494g
            r0.getClass()
            if (r1 == 0) goto L_0x0985
            int r2 = r1.length()
            if (r2 > 0) goto L_0x096c
            goto L_0x0985
        L_0x096c:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f82713d
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r1)
            r12 = 0
            r3[r12] = r1
            java.lang.String r1 = "OpenMsgListener"
            java.lang.String r2 = "appId=?"
            int r0 = r0.delete(r1, r2, r3)
            if (r0 > 0) goto L_0x0983
            goto L_0x0986
        L_0x0983:
            r0 = 1
            goto L_0x0987
        L_0x0985:
            r12 = 0
        L_0x0986:
            r0 = 0
        L_0x0987:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r12] = r2
            java.lang.String r2 = r8.f269494g
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = r26.mo128169b()
            r1[r13] = r2
            java.lang.String r2 = "doUnRegisterMsgListener ret = %s, appId = %s, pkg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            if (r0 != 0) goto L_0x09a8
            r0 = 2008(0x7d8, float:2.814E-42)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x09c9
        L_0x09a8:
            r8.mo128175h(r12, r12, r3)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r3)
            goto L_0x09c9
        L_0x09b0:
            r3 = 1
            r12 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r12] = r1
            java.lang.String r1 = "wrong args, no such op, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r8.mo128177j(r4, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x09c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
