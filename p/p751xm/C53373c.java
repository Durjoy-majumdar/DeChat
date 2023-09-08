package p751xm;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44562k;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import ld2.C46848g;
import md2.C47000b;
import p166hy.C46134x;
import p749xh.C53334e0;
import p763ym.C79138l;
import zt3.C119157j;

@C86522b
/* renamed from: xm.c */
public class C53373c extends C86301e implements C79138l {
    /* renamed from: Ae */
    public boolean mo73985Ae(String str) {
        return C44565l.m48985e(str);
    }

    public boolean Bl0(Context context, long j) {
        ArrayList arrayList = new ArrayList();
        C44579p Bx0 = C46848g.Bx0();
        Bx0.getClass();
        StringBuilder sb = new StringBuilder(256);
        sb.append("select * from ");
        sb.append("AppInfo");
        sb.append(" where ");
        sb.append(" ( ");
        sb.append("appSupportContentType");
        sb.append(" & ");
        sb.append(j);
        sb.append(" ) != 0");
        sb.append(" and ");
        sb.append(" ( ");
        sb.append("svrAppSupportContentType");
        sb.append(" & ");
        sb.append(j);
        sb.append(" ) != 0");
        sb.append(" and ");
        sb.append(" ( ");
        sb.append("appInfoFlag");
        sb.append(" & ");
        sb.append(8192);
        sb.append(" ) != 0");
        sb.append(" and ");
        sb.append("status");
        sb.append(" != ");
        sb.append(4);
        Log.m105927v("MicroMsg.AppInfoStorage", "getAppInfoByContentFlag sql %s", sb.toString());
        Cursor rawQuery = Bx0.rawQuery(sb.toString(), new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
            rawQuery = null;
        }
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C44561j jVar = new C44561j();
                jVar.convertFrom(rawQuery);
                if (jVar.field_status == 1) {
                    if (!C44565l.m48996p(context, jVar.field_appId)) {
                        jVar.field_status = 4;
                        C47000b.C34548a.m40384a().mo72197Nz(jVar);
                    } else if (!Util.isNullOrNil(jVar.field_signature)) {
                        arrayList.add(jVar);
                    }
                } else if (jVar.field_signature != null) {
                    arrayList.add(jVar);
                }
            }
            rawQuery.close();
        }
        return arrayList.size() != 0;
    }

    /* renamed from: D8 */
    public boolean mo73987D8(C44561j jVar) {
        return !Util.isNullOrNil(jVar.field_packageName);
    }

    public boolean Dm0(Context context, Intent intent, String str, C44580q1 q1Var, Bundle bundle) {
        return C44565l.m48999s(context, intent, str, 0, q1Var, bundle);
    }

    public boolean E10(C44561j jVar) {
        return jVar == null || (jVar.field_appInfoFlag & 2) == 0;
    }

    /* renamed from: GW */
    public C44561j mo73990GW(String str, boolean z) {
        return C44565l.m48989i(str, z, false);
    }

    /* renamed from: JL */
    public boolean mo73991JL(C44561j jVar) {
        return jVar != null && !Util.isNullOrNil(jVar.field_appId) && (jVar.field_appInfoFlag & 1) > 0;
    }

    /* renamed from: KS */
    public String mo73992KS(Context context, String str, int i) {
        return C44565l.m48993m(context, C44565l.m48988h(str, i), (String) null);
    }

    /* renamed from: L1 */
    public boolean mo73993L1(String str) {
        return str != null && str.trim().length() != 0 && !str.equals("weixinfile") && !str.equals("invalid_appname");
    }

    /* renamed from: Lc */
    public boolean mo73994Lc(String str) {
        if (Util.isEqual("wx485a97c844086dc9", str) || Util.isEqual("wxaf060266bfa9a35c", str)) {
            return true;
        }
        C44561j g = C44565l.m48987g(str);
        return g != null && !Util.isNullOrNil(g.field_packageName) && !Util.isNullOrNil(g.field_signature);
    }

    /* renamed from: Lw */
    public ShowMessageFromWX.Req mo73995Lw(Context context, WXMediaMessage wXMediaMessage, String str) {
        return C44565l.m48982b(context, wXMediaMessage, str);
    }

    public boolean Lw0(String str) {
        C44561j g;
        if (Util.isNullOrNil(str) || (g = C44565l.m48987g(str)) == null || Util.isNullOrNil(g.field_appId)) {
            return false;
        }
        boolean z = (g.field_appInfoFlag & 32) > 0;
        Log.m105927v("MicroMsg.AppInfoLogic", "canShowSNSTail, appid = %s, ret = %b", g.field_appId, Boolean.valueOf(z));
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: OL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo73997OL(com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 30
            if (r0 >= r2) goto L_0x0009
            goto L_0x00e1
        L_0x0009:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r5 = r5.mediaObject
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXImageObject
            java.lang.String r2 = "content"
            r3 = 0
            if (r0 == 0) goto L_0x0034
            com.tencent.mm.opensdk.modelmsg.WXImageObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r5
            byte[] r0 = r5.imageData
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length
            if (r0 <= 0) goto L_0x001d
            goto L_0x00e1
        L_0x001d:
            java.lang.String r5 = r5.imagePath
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x0027
            goto L_0x00e1
        L_0x0027:
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
            goto L_0x00e1
        L_0x0031:
            r1 = 0
            goto L_0x00e1
        L_0x0034:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXFileObject
            if (r0 == 0) goto L_0x0057
            com.tencent.mm.opensdk.modelmsg.WXFileObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXFileObject) r5
            byte[] r0 = r5.fileData
            if (r0 == 0) goto L_0x0043
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0043
            goto L_0x00e1
        L_0x0043:
            java.lang.String r5 = r5.filePath
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x004d
            goto L_0x00e1
        L_0x004d:
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
            goto L_0x00e1
        L_0x0057:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject
            if (r0 == 0) goto L_0x007a
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject) r5
            byte[] r0 = r5.emojiData
            if (r0 == 0) goto L_0x0066
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0066
            goto L_0x00e1
        L_0x0066:
            java.lang.String r5 = r5.emojiPath
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x0070
            goto L_0x00e1
        L_0x0070:
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
            goto L_0x00e1
        L_0x007a:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject
            if (r0 == 0) goto L_0x0092
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject) r5
            java.lang.String r5 = r5.filePath
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x0089
            goto L_0x00e1
        L_0x0089:
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
            goto L_0x00e1
        L_0x0092:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject
            if (r0 == 0) goto L_0x00aa
            com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject) r5
            java.lang.String r5 = r5.filePath
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00e1
        L_0x00a1:
            if (r5 == 0) goto L_0x0031
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
            goto L_0x00e1
        L_0x00aa:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject
            if (r0 == 0) goto L_0x00c9
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject) r5
            byte[] r0 = r5.fileData
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00b8
            goto L_0x00e1
        L_0x00b8:
            java.lang.String r5 = r5.filePath
            if (r5 != 0) goto L_0x00bd
            goto L_0x00e1
        L_0x00bd:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00e1
        L_0x00c4:
            boolean r1 = r5.startsWith(r2)
            goto L_0x00e1
        L_0x00c9:
            boolean r0 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject
            if (r0 == 0) goto L_0x00e1
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r5
            java.lang.String r5 = r5.hdAlbumThumbFilePath
            if (r5 != 0) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48997q(r5)
            if (r0 == 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x0031
        L_0x00e1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p751xm.C53373c.mo73997OL(com.tencent.mm.opensdk.modelmsg.WXMediaMessage):boolean");
    }

    public C44561j Pw0(String str, boolean z, boolean z2) {
        return C44565l.m48989i(str, z, z2);
    }

    /* renamed from: QH */
    public boolean mo73999QH(Context context, Intent intent, String str, int i, C44580q1 q1Var, Bundle bundle) {
        return C44565l.m48999s(context, intent, str, i, q1Var, bundle);
    }

    /* renamed from: Sy */
    public boolean mo74000Sy(Context context, Intent intent, String str) {
        return C44565l.m48999s(context, intent, str, 0, (C44580q1) null, (Bundle) null);
    }

    /* renamed from: TT */
    public C44561j mo74001TT(String str, boolean z) {
        return C44565l.m48990j(str, z);
    }

    public boolean Tb0(Context context, String str) {
        return C44565l.m48996p(context, str);
    }

    /* renamed from: UV */
    public C44561j mo74003UV(String str, int i) {
        return C44565l.m48988h(str, i);
    }

    /* renamed from: WW */
    public void mo74004WW(String str, String str2, C79138l.C53540a aVar) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || aVar == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getAppInfoASync, appId is null");
            if (aVar != null) {
                aVar.mo74207a((C44561j) null);
                return;
            }
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C44562k(aVar, str, str2), "GetAppInfoASyncThread");
    }

    public boolean Wo0(Context context, String str, String str2, ShowMessageFromWX.Req req, C44580q1 q1Var, Bundle bundle) {
        return C44565l.m49001u(context, str, str2, req, 0, q1Var, bundle);
    }

    /* renamed from: a3 */
    public boolean mo74006a3(String str) {
        return C44565l.m48998r(str);
    }

    public boolean cg0(String str) {
        C44561j g;
        if (!Util.isNullOrNil(str) && (g = C44565l.m48987g(str)) != null && !Util.isNullOrNil(g.field_appId)) {
            return g.field_appId.equals("wx7fa037cc7dfabad5") || (g.field_appInfoFlag & 8) > 0;
        }
        return false;
    }

    public boolean df0(WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            return false;
        }
        C46848g.vx0();
        String str = C46848g.xx0() + "content_" + Util.nowMilliSecond();
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        if (iMediaObject instanceof WXImageObject) {
            WXImageObject wXImageObject = (WXImageObject) iMediaObject;
            String str2 = wXImageObject.imagePath;
            if (C44565l.m48985e(str2)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str2);
                if (str2.startsWith("content")) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str2, str, false)));
                    wXImageObject.imagePath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str2);
                return false;
            }
        } else if (iMediaObject instanceof WXFileObject) {
            WXFileObject wXFileObject = (WXFileObject) iMediaObject;
            String str3 = wXFileObject.filePath;
            if (C44565l.m48985e(str3)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str3);
                if (str3.startsWith("content")) {
                    String o = C86013q1.m106454o(str3);
                    if (!Util.isNullOrNil(o)) {
                        str = str + "." + o;
                    }
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str3, str, false)));
                    wXFileObject.filePath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str3);
                return false;
            }
        } else if (iMediaObject instanceof WXEmojiObject) {
            WXEmojiObject wXEmojiObject = (WXEmojiObject) iMediaObject;
            String str4 = wXEmojiObject.emojiPath;
            if (C44565l.m48985e(str4)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str4);
                if (str4.startsWith("content")) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str4, str, false)));
                    wXEmojiObject.emojiPath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str4);
                return false;
            }
        } else if (iMediaObject instanceof WXVideoFileObject) {
            WXVideoFileObject wXVideoFileObject = (WXVideoFileObject) iMediaObject;
            String str5 = wXVideoFileObject.filePath;
            if (C44565l.m48985e(str5)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str5);
                if (str5.startsWith("content")) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str5, str, false)));
                    wXVideoFileObject.filePath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str5);
                return false;
            }
        } else if (iMediaObject instanceof WXGameVideoFileObject) {
            WXGameVideoFileObject wXGameVideoFileObject = (WXGameVideoFileObject) iMediaObject;
            String str6 = wXGameVideoFileObject.filePath;
            if (C44565l.m48985e(str6)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str6);
                if (str6.startsWith("content")) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str6, str, false)));
                    wXGameVideoFileObject.filePath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str6);
                return false;
            }
        } else if (iMediaObject instanceof WXAppExtendObject) {
            WXAppExtendObject wXAppExtendObject = (WXAppExtendObject) iMediaObject;
            String str7 = wXAppExtendObject.filePath;
            if (C44565l.m48985e(str7)) {
                Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str7);
                if (str7.startsWith("content")) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str7, str, false)));
                    wXAppExtendObject.filePath = str;
                }
            } else {
                Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str7);
                return false;
            }
        } else if (!(iMediaObject instanceof WXMusicVideoObject)) {
            return false;
        } else {
            WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject;
            String str8 = wXMusicVideoObject.hdAlbumThumbFilePath;
            if (str8 != null) {
                if (C44565l.m48985e(str8)) {
                    Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str8);
                    if (str8.startsWith("content")) {
                        Log.m105925i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", str, Integer.valueOf(wXMediaMessage.getType()), Long.valueOf(C86013q1.m106443d(str8, str, false)));
                        wXMusicVideoObject.hdAlbumThumbFilePath = str;
                    }
                } else {
                    Log.m105921e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str8);
                    return false;
                }
            }
        }
        return true;
    }

    public C44561j getAppInfo(String str) {
        return C44565l.m48987g(str);
    }

    /* renamed from: gu */
    public boolean mo74010gu(Context context, String str, WXMediaMessage wXMediaMessage, int i, C44580q1 q1Var, Bundle bundle) {
        if (context == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "launch app failed: context is null");
            if (q1Var == null) {
                return false;
            }
            q1Var.mo1579a(false, false);
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppInfoLogic", "launch app failed: appid is null or nil");
            if (q1Var == null) {
                return false;
            }
            q1Var.mo1579a(false, false);
            return false;
        } else if (wXMediaMessage == null) {
            Log.m105920e("MicroMsg.AppInfoLogic", "launch app failed: wxMsg is null");
            if (q1Var == null) {
                return false;
            }
            q1Var.mo1579a(false, false);
            return false;
        } else {
            C44561j h = Looper.myLooper() == Looper.getMainLooper() ? C44565l.m48988h(str, Integer.MAX_VALUE) : C44565l.m48990j(str, false);
            if (h == null) {
                Log.m105921e("MicroMsg.AppInfoLogic", "get appinfo is null, appid is : [%s]", str);
                if (q1Var == null) {
                    return false;
                }
                q1Var.mo1579a(false, false);
                return false;
            } else if (h.field_status == 3) {
                Log.m105920e("MicroMsg.AppInfoLogic", "requestAppShow fail, app is in blacklist, packageName = " + h.field_packageName);
                if (q1Var == null) {
                    return false;
                }
                q1Var.mo1579a(false, false);
                return false;
            } else {
                return C44565l.m49000t(context, h.field_packageName, wXMediaMessage, str, h.field_openId, i, q1Var, bundle);
            }
        }
    }

    /* renamed from: hv */
    public String mo74011hv(Context context, C53334e0 e0Var) {
        return C44565l.m48993m(context, (C44561j) e0Var, (String) null);
    }

    /* renamed from: l5 */
    public String mo74012l5(Context context, String str) {
        return C44565l.m48993m(context, C44565l.m48987g(str), (String) null);
    }

    public boolean px0(Context context, Intent intent, String str, C44580q1 q1Var) {
        return C44565l.m48999s(context, intent, str, 0, q1Var, (Bundle) null);
    }

    public void q70(Bundle bundle) {
        String f = C44565l.m48986f(bundle);
        if (f != null) {
            ((C46134x) C86312j.m106911c(C46134x.class)).g70(f);
        }
    }

    public int ta0(int i) {
        return (i == 1 || i == 2) ? 19 : -1;
    }

    /* renamed from: tz */
    public boolean mo74016tz(Context context, C44561j jVar) {
        return C44565l.m48995o(context, jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.activityInfo;
     */
    /* renamed from: uF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo74017uF(android.content.pm.ResolveInfo r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0014
        L_0x0004:
            java.lang.String r0 = r3.resolvePackageName
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0013
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r3.packageName
            goto L_0x0014
        L_0x0013:
            r3 = r0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p751xm.C53373c.mo74017uF(android.content.pm.ResolveInfo):java.lang.String");
    }

    /* renamed from: ub */
    public Bitmap mo74018ub(String str, int i, float f) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoLogic", "getAppIcon, appId is null");
            return null;
        } else if (!C86709a0.m107523b().mo121114l()) {
            return null;
        } else {
            if (C86709a0.m107535s().mo121147n()) {
                Bitmap V80 = C47000b.C34548a.m40384a().V80(str, i, f);
                if (V80 == null) {
                    Log.m105928w("MicroMsg.AppInfoLogic", "getAppIcon, bm does not exist or has been recycled");
                    C47000b.C34548a.m40384a().pf0(str, i);
                    return null;
                } else if (V80.isRecycled()) {
                    return null;
                } else {
                    return V80;
                }
            } else if (MMApplicationContext.getContext() == null || MMApplicationContext.getContext().getResources() == null) {
                return null;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        return null;
                    }
                    if (!(i == 3 || i == 4 || i == 5)) {
                        Log.m105920e("MicroMsg.AppInfoLogic", "getAppIcon, unknown iconType = " + i);
                        return null;
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.blk);
                if (decodeResource == null || decodeResource.isRecycled()) {
                    return null;
                }
                return decodeResource;
            }
        }
    }

    /* renamed from: xG */
    public String mo74019xG(Context context, C53334e0 e0Var, String str) {
        return C44565l.m48993m(context, (C44561j) e0Var, str);
    }

    public boolean xw0(Context context, Uri uri, C44580q1 q1Var) {
        if (context == null || uri == null) {
            Log.m105924i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
            if (q1Var == null) {
                return false;
            }
            q1Var.mo1579a(false, false);
            return false;
        }
        Log.m105924i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        return C44565l.m48999s(context, intent, (String) null, 0, q1Var, (Bundle) null);
    }

    public boolean yw0(Context context, String str, WXMediaMessage wXMediaMessage, String str2, String str3, int i, C44580q1 q1Var, Bundle bundle) {
        return C44565l.m49000t(context, str, wXMediaMessage, str2, str3, i, q1Var, bundle);
    }
}
