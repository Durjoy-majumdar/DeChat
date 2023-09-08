package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72918o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ld2.C46848g;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C49979je;
import te3.C51163rv3;
import te3.C51598uu1;
import te3.C51742vu1;

/* renamed from: com.tencent.mm.pluginsdk.model.app.f1 */
public class C44553f1 extends C44549d1 {

    /* renamed from: e */
    public static final String[] f120827e = {"wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b"};

    public C44553f1(List<String> list) {
        MultiProcessMMKV singleMMKV;
        LinkedList<String> linkedList = new LinkedList<>(list);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51598uu1();
        bVar.f127067b = new C51742vu1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getappinfolist";
        bVar.f127069d = 451;
        boolean z = false;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f120809d = a;
        C51598uu1 uu12 = (C51598uu1) a.f127055a.f127080a;
        LinkedList<C51163rv3> d = mo69349d(linkedList);
        uu12.f143140e = d;
        uu12.f143139d = d.size();
        LinkedList linkedList2 = new LinkedList();
        LinkedList<C51163rv3> linkedList3 = new LinkedList<>();
        if (!Util.isNullOrNil((List) linkedList) && (singleMMKV = MultiProcessMMKV.getSingleMMKV("key_open_sdk_pkg")) != null) {
            for (String decodeString : linkedList) {
                linkedList2.add(singleMMKV.decodeString(decodeString, ""));
            }
            Iterator it = linkedList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!Util.isNullOrNil((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                linkedList3 = mo69349d(linkedList2);
            }
        }
        uu12.f143142g = linkedList3;
        uu12.f143141f = linkedList3.size();
    }

    /* renamed from: a */
    public void mo69337a(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
            return;
        }
        try {
            this.f120809d.f127056b.fromProtoBuf(bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetAppInfoList", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public int mo69338b() {
        return 7;
    }

    /* renamed from: c */
    public byte[] mo69339c() {
        try {
            return ((C47350c.C47353c) this.f120809d.getReqObj()).toProtoBuf();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public final LinkedList<C51163rv3> mo69349d(List<String> list) {
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        if (list == null) {
            return linkedList;
        }
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        for (int i = 0; i < size; i++) {
            String str = strArr[i];
            if (!Util.isNullOrNil(str)) {
                linkedList.add(C48374j0.m53720i(str));
            }
        }
        return linkedList;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        int i4 = i2;
        int i5 = i3;
        Log.m105918d("MicroMsg.NetSceneGetAppInfoList", "errType = " + i4 + ", errCode = " + i5);
        if (i4 == 0 && i5 == 0) {
            LinkedList<C49979je> linkedList = ((C51742vu1) this.f120809d.f127056b.f127083a).f143701e;
            if (linkedList != null && !linkedList.isEmpty()) {
                Iterator<C49979je> it = linkedList.iterator();
                while (it.hasNext()) {
                    C49979je next = it.next();
                    if (next != null) {
                        int i6 = 0;
                        C44561j i7 = C44565l.m48989i(next.f136025d, false, false);
                        if (i7 == null) {
                            i7 = new C44561j();
                            i7.field_appId = next.f136025d;
                            z = true;
                        } else {
                            z = false;
                        }
                        Log.m105925i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", next.f136025d, Integer.valueOf(next.f136040v), Long.valueOf(next.f136024C));
                        Log.m105925i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", i7.field_appId, i7.field_appName, Integer.valueOf(i7.field_status), Integer.valueOf(i7.field_appInfoFlag));
                        if (!i7.mo69361t2() || Util.isNullOrNil(i7.field_appName)) {
                            i7.field_appName = next.f136026e;
                        }
                        if (!i7.mo69361t2() || Util.isNullOrNil(i7.field_appName_en)) {
                            i7.field_appName_en = next.f136028g;
                        }
                        if (!i7.mo69361t2() || Util.isNullOrNil(i7.field_appName_tw)) {
                            i7.field_appName_tw = next.f136030i;
                        }
                        i7.field_appDiscription = next.f136027f;
                        i7.field_appDiscription_en = next.f136029h;
                        i7.field_appDiscription_tw = next.f136031j;
                        i7.field_appWatermarkUrl = next.f136035q;
                        i7.field_packageName = next.f136036r;
                        String str3 = next.f136037s;
                        if (str3 == null || str3.length() == 0) {
                            Log.m105920e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
                            str2 = null;
                        } else {
                            str2 = C72688j0.m85019e(str3);
                        }
                        i7.field_signature = str2;
                        Log.m105925i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s pkd: %s", next.f136037s, str2, next.f136036r);
                        String str4 = next.f136038t;
                        i7.field_appType = str4;
                        if (!Util.isNullOrNil(str4) && (i7.field_appType.startsWith("1") || i7.field_appType.startsWith(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN))) {
                            i7.field_appType = "," + i7.field_appType;
                        }
                        i7.field_appInfoFlag = next.f136040v;
                        i7.field_appVersion = next.f136041w;
                        i7.f149240H = next.f136039u;
                        i7.f149233A = true;
                        i7.field_appWatermarkUrl = next.f136035q;
                        if (!Util.isNullOrNil(next.f136044z) && !Util.isNullOrNil(next.f136022A)) {
                            Log.m105925i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", i7.field_appName, next.f136044z, next.f136022A);
                            i7.mo73948q2(next.f136044z);
                            i7.mo73947p2(next.f136022A);
                        }
                        i7.mo73949r2(next.f136023B);
                        i7.field_svrAppSupportContentType = next.f136024C;
                        int i8 = next.f136042x;
                        if (i8 > i7.f149242J) {
                            i7.f149243K = 1;
                            i7.f149233A = true;
                        }
                        i7.f149242J = i8;
                        i7.f149233A = true;
                        String str5 = next.f136036r;
                        boolean z4 = str5 == null || str5.length() == 0 || str5.length() == 0;
                        if (z4) {
                            Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + next.f136036r + "appid: " + i7.field_appId);
                        }
                        if (i7.mo69359k()) {
                            C72918o.m85515c(i7.field_appId);
                        }
                        C44579p Bx0 = C46848g.Bx0();
                        if (z) {
                            i7.field_status = z4 ? 3 : 4;
                            i7.field_modifyTime = System.currentTimeMillis();
                            i7.field_appIconUrl = next.f136033o;
                            if (i7.field_appId != null) {
                                while (true) {
                                    String[] strArr = f120827e;
                                    if (i6 >= 3) {
                                        break;
                                    } else if (i7.field_appId.equals(strArr[i6])) {
                                        i7.field_status = -1;
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            if (!Bx0.insert(i7)) {
                                Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
                            } else {
                                C46848g.zx0().mo69352a(i7.field_appId, 1);
                                C46848g.zx0().mo69352a(i7.field_appId, 2);
                                C46848g.zx0().mo69352a(i7.field_appId, 3);
                                C46848g.zx0().mo69352a(i7.field_appId, 4);
                                C46848g.zx0().mo69352a(i7.field_appId, 5);
                            }
                        } else {
                            i7.field_status = z4 ? 3 : i7.field_status;
                            if (i7.field_appId != null) {
                                int i9 = 0;
                                while (true) {
                                    String[] strArr2 = f120827e;
                                    if (i9 >= 3) {
                                        break;
                                    } else if (i7.field_appId.equals(strArr2[i9])) {
                                        i7.field_status = -1;
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            String str6 = i7.field_appIconUrl;
                            if (str6 == null || str6.length() == 0) {
                                z2 = true;
                            } else {
                                String str7 = next.f136043y;
                                z2 = (str7 == null || str7.length() == 0) ? false : !i7.field_appIconUrl.equals(next.f136033o);
                            }
                            if (z2) {
                                Log.m105925i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", i7.field_appIconUrl, next.f136033o);
                                i7.field_appIconUrl = next.f136033o;
                                z3 = Bx0.update(i7, new String[0]);
                                C46848g.zx0().mo69352a(i7.field_appId, 1);
                                C46848g.zx0().mo69352a(i7.field_appId, 2);
                                C46848g.zx0().mo69352a(i7.field_appId, 3);
                                C46848g.zx0().mo69352a(i7.field_appId, 4);
                                C46848g.zx0().mo69352a(i7.field_appId, 5);
                            } else {
                                z3 = Bx0.update(i7, new String[0]);
                            }
                            Log.m105924i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + z3 + ", appid = " + next.f136025d);
                        }
                    }
                }
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneGetAppInfoList", "errType = " + i4 + ", errCode = " + i5);
    }
}
