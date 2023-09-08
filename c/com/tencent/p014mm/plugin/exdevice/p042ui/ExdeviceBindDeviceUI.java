package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.plugin.exdevice.model.C41123d1;
import com.tencent.p014mm.plugin.exdevice.model.C41128f1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41175x;
import com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d81.C45288e;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qw0.C47887a;
import sf0.C48374j0;
import te3.C49697hf2;
import te3.C49840if2;
import te3.C50052jy2;
import te3.C51043r10;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI */
public class ExdeviceBindDeviceUI extends MMActivity implements ExdeviceEventManager.C41111e, C11385n {

    /* renamed from: x */
    public static final /* synthetic */ int f111020x = 0;

    /* renamed from: d */
    public ListView f111021d;

    /* renamed from: e */
    public C41243k f111022e;

    /* renamed from: f */
    public View f111023f;

    /* renamed from: g */
    public TextView f111024g;

    /* renamed from: h */
    public TextView f111025h;

    /* renamed from: i */
    public ImageView f111026i;

    /* renamed from: j */
    public ScrollView f111027j;

    /* renamed from: n */
    public TextView f111028n;

    /* renamed from: o */
    public TextView f111029o;

    /* renamed from: p */
    public View f111030p;

    /* renamed from: q */
    public C41248o f111031q;

    /* renamed from: r */
    public String f111032r;

    /* renamed from: s */
    public String f111033s;

    /* renamed from: t */
    public C2242s0.C2243a f111034t;

    /* renamed from: u */
    public C2242s0.C2243a f111035u;

    /* renamed from: v */
    public boolean f111036v = false;

    /* renamed from: w */
    public boolean f111037w = false;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$a */
    public class C41232a extends ClickableSpan {
        public C41232a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$10", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceBindDeviceUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$10", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$b */
    public class C41233b implements MenuItem.OnMenuItemClickListener {
        public C41233b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceBindDeviceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$c */
    public class C41234c implements C2242s0.C2243a {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$c$a */
        public class C41235a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C41249p f111041d;

            public C41235a(C41249p pVar) {
                this.f111041d = pVar;
            }

            public void run() {
                ExdeviceBindDeviceUI.this.mo64294I7(this.f111041d);
            }
        }

        public C41234c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2128a(int r8, java.lang.Object... r9) {
            /*
                r7 = this;
                java.lang.String r0 = "manufacturerData"
                java.lang.String r1 = "MicroMsg.ExdeviceBindDeviceUI"
                r2 = 10
                if (r8 != r2) goto L_0x008f
                if (r9 != 0) goto L_0x000c
                goto L_0x008f
            L_0x000c:
                r8 = 0
                r9 = r9[r8]
                byte[] r9 = (byte[]) r9
                r2 = 0
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x003e }
                r3.<init>(r9)     // Catch:{ Exception -> 0x003e }
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x003e }
                r9.<init>(r3)     // Catch:{ Exception -> 0x003e }
                java.lang.String r3 = "deviceInfo"
                org.json.JSONObject r3 = r9.getJSONObject(r3)     // Catch:{ Exception -> 0x003e }
                java.lang.String r4 = "deviceType"
                java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x003e }
                java.lang.String r5 = "deviceId"
                java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x003b }
                boolean r5 = r9.isNull(r0)     // Catch:{ Exception -> 0x0039 }
                if (r5 != 0) goto L_0x004d
                java.lang.String r9 = r9.getString(r0)     // Catch:{ Exception -> 0x0039 }
                goto L_0x004e
            L_0x0039:
                r9 = move-exception
                goto L_0x0041
            L_0x003b:
                r9 = move-exception
                r3 = r2
                goto L_0x0041
            L_0x003e:
                r9 = move-exception
                r3 = r2
                r4 = r3
            L_0x0041:
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.String r5 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r9, r5, r0)
                java.lang.String r9 = "json decode failed: deviceInfo decode"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
            L_0x004d:
                r9 = r2
            L_0x004e:
                if (r4 == 0) goto L_0x008f
                if (r3 != 0) goto L_0x0053
                goto L_0x008f
            L_0x0053:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p r0 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI r5 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.this
                r0.<init>(r5, r2)
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$l r6 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41245l.CONNECT_PROTO_TYPE_WIFI
                r0.f111072b = r6
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$n r6 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$n
                r6.<init>(r5, r2)
                r0.f111074d = r6
                r6.f111065a = r4
                r6.f111066b = r3
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r3 != 0) goto L_0x0085
                byte[] r9 = r9.getBytes()
                r2 = 2
                java.lang.String r9 = android.util.Base64.encodeToString(r9, r2)
                r0.f111079i = r9
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r8] = r9
                java.lang.String r8 = "device.mManufacturerData: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r2)
                goto L_0x0087
            L_0x0085:
                r0.f111079i = r2
            L_0x0087:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$c$a r8 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$c$a
                r8.<init>(r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41234c.mo2128a(int, java.lang.Object[]):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$d */
    public class C41236d implements C2242s0.C2243a {
        public C41236d(ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        }

        /* renamed from: a */
        public void mo2128a(int i, Object... objArr) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$e */
    public class C41237e implements AdapterView.OnItemClickListener {
        public C41237e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C41249p h = ExdeviceBindDeviceUI.this.f111022e.getItem(i - ((ListView) adapterView).getHeaderViewsCount());
            if (h.f111076f.f135299w != 0) {
                ExdeviceBindDeviceUI.m44655H7(ExdeviceBindDeviceUI.this, h);
            } else {
                ExdeviceBindDeviceUI exdeviceBindDeviceUI = ExdeviceBindDeviceUI.this;
                exdeviceBindDeviceUI.getClass();
                C50052jy2 jy22 = h.f111078h;
                if (jy22 == null) {
                    Log.m105920e("MicroMsg.ExdeviceBindDeviceUI", "Device.contact == null");
                } else {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(C48374j0.m53718g(jy22.f136424d));
                    Intent intent = new Intent();
                    intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, h.f111075e.f134597e);
                    intent.putExtra("device_type", h.f111075e.f134596d);
                    intent.putExtra("Contact_User", C48374j0.m53718g(jy22.f136424d));
                    intent.putExtra("Contact_Scene", jy22.f136462x);
                    intent.putExtra("KIsHardDevice", true);
                    intent.putExtra("KHardDeviceBindTicket", h.f111077g);
                    if (z1Var != null) {
                        if (!z1Var.mo62927s3()) {
                            intent.putExtra("Contact_Alias", jy22.f136395J);
                            intent.putExtra("Contact_Nick", jy22.f136426e.f141175d);
                            intent.putExtra("Contact_Signature", jy22.f136386A);
                            intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(jy22.f136405S, jy22.f136464y, jy22.f136466z));
                            intent.putExtra("Contact_Sex", jy22.f136432h);
                            intent.putExtra("Contact_VUser_Info", jy22.f136390E);
                            intent.putExtra("Contact_VUser_Info_Flag", jy22.f136389D);
                            intent.putExtra("Contact_KWeibo_flag", jy22.f136398M);
                            intent.putExtra("Contact_KWeibo", jy22.f136393H);
                            intent.putExtra("Contact_KWeiboNick", jy22.f136397L);
                            C51043r10 r102 = jy22.f136413W;
                            if (r102 != null) {
                                try {
                                    intent.putExtra("Contact_customInfo", r102.toByteArray());
                                } catch (IOException e) {
                                    Log.printErrStackTrace("MicroMsg.ExdeviceBindDeviceUI", e, "", new Object[0]);
                                }
                            }
                        }
                        C88144b.m109791i(exdeviceBindDeviceUI.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$f */
    public class C41238f implements Runnable {
        public C41238f(ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        }

        public void run() {
            Java2CExDevice.stopScanWCLanDevice();
            Java2CExDevice.releaseWCLanDeviceLib();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$g */
    public class C41239g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C41249p f111044d;

        public C41239g(C41249p pVar) {
            this.f111044d = pVar;
        }

        public void run() {
            ExdeviceBindDeviceUI.this.mo64294I7(this.f111044d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$h */
    public class C41240h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f111046d;

        /* renamed from: e */
        public final /* synthetic */ int f111047e;

        /* renamed from: f */
        public final /* synthetic */ String f111048f;

        /* renamed from: g */
        public final /* synthetic */ C117747y f111049g;

        public C41240h(int i, int i2, String str, C117747y yVar) {
            this.f111046d = i;
            this.f111047e = i2;
            this.f111048f = str;
            this.f111049g = yVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01c9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r16 = this;
                r0 = r16
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI r1 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.this
                int r2 = r0.f111046d
                int r3 = r0.f111047e
                java.lang.String r4 = r0.f111048f
                ob0.y r5 = r0.f111049g
                int r6 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.f111020x
                r1.getClass()
                boolean r6 = r5 instanceof com.tencent.p014mm.plugin.exdevice.model.C2246y0
                r7 = 0
                r8 = 3
                r9 = 2
                r10 = 0
                r11 = 1
                java.lang.String r12 = "MicroMsg.ExdeviceBindDeviceUI"
                if (r6 == 0) goto L_0x003b
                com.tencent.mm.plugin.exdevice.model.y0 r5 = (com.tencent.p014mm.plugin.exdevice.model.C2246y0) r5
                if (r2 != 0) goto L_0x0022
                if (r3 == 0) goto L_0x0037
            L_0x0022:
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r7] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r1[r11] = r2
                r1[r9] = r4
                java.lang.String r2 = "NetSceneGetHardDeviceHelpUrl onSceneEnd, errType(%d) errCode(%d) errMsg(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r1)
            L_0x0037:
                r5.getClass()
                throw r10
            L_0x003b:
                boolean r6 = r5 instanceof com.tencent.p014mm.plugin.exdevice.model.C41123d1
                java.lang.String r13 = "DiscoverDevice.mHardDevice is not null"
                r14 = 4
                java.lang.String r15 = "DiscoverDevice is null"
                if (r6 == 0) goto L_0x0122
                com.tencent.mm.plugin.exdevice.model.d1 r5 = (com.tencent.p014mm.plugin.exdevice.model.C41123d1) r5
                ob0.c r5 = r5.f110789e
                if (r5 == 0) goto L_0x0052
                ob0.c$c r6 = r5.f127055a
                pe3.a r6 = r6.f127080a
                if (r6 == 0) goto L_0x0052
                te3.ex3 r6 = (te3.C49348ex3) r6
            L_0x0052:
                ob0.c$d r5 = r5.f127056b
                pe3.a r5 = r5.f127083a
                te3.fx3 r5 = (te3.C49485fx3) r5
                if (r2 != 0) goto L_0x010b
                if (r3 == 0) goto L_0x005e
                goto L_0x010b
            L_0x005e:
                te3.if2 r2 = r5.f133730e
                if (r2 != 0) goto L_0x0069
                java.lang.String r1 = "HardDeviceAttr is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
                goto L_0x0237
            L_0x0069:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r3 = r1.f111022e
                java.lang.String r2 = r2.f135285f
                r3.getClass()
                if (r2 == 0) goto L_0x00a9
                int r4 = r2.length()
                if (r4 != 0) goto L_0x0079
                goto L_0x00a9
            L_0x0079:
                r4 = 0
            L_0x007a:
                java.util.List<com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p> r6 = r3.f111053d
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                int r6 = r6.size()
                if (r4 >= r6) goto L_0x00a9
                java.util.List<com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p> r6 = r3.f111053d
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r6 = r6.get(r4)
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p r6 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41249p) r6
                java.lang.String r10 = r6.mo64319a()
                boolean r10 = r3.mo64310d(r10)
                if (r10 == 0) goto L_0x0099
                goto L_0x00a5
            L_0x0099:
                java.lang.String r10 = r6.mo64319a()
                boolean r10 = r2.equalsIgnoreCase(r10)
                if (r10 == 0) goto L_0x00a5
                r10 = r6
                goto L_0x00aa
            L_0x00a5:
                int r4 = r4 + 1
                r10 = 0
                goto L_0x007a
            L_0x00a9:
                r10 = 0
            L_0x00aa:
                if (r10 != 0) goto L_0x00b1
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r15)
                goto L_0x0237
            L_0x00b1:
                te3.hf2 r2 = r10.f111075e
                if (r2 == 0) goto L_0x00ba
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
                goto L_0x0237
            L_0x00ba:
                te3.if2 r2 = r5.f133730e
                r10.f111076f = r2
                te3.hf2 r2 = r5.f133729d
                r10.f111075e = r2
                java.lang.String r2 = r5.f133731f
                r10.f111077g = r2
                te3.jy2 r2 = r5.f133732g
                r10.f111078h = r2
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r2 = r1.f111022e
                r2.getClass()
                java.lang.String r3 = r10.mo64320b()
                int r3 = r2.mo64308a(r3)
                if (r3 >= 0) goto L_0x00da
                goto L_0x00e0
            L_0x00da:
                boolean r2 = r2.mo64309b(r10)
                r10.f111071a = r2
            L_0x00e0:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r1 = r1.f111022e
                r1.notifyDataSetChanged()
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                te3.hf2 r2 = r5.f133729d
                java.lang.String r3 = r2.f134596d
                r1[r7] = r3
                java.lang.String r2 = r2.f134597e
                r1[r11] = r2
                te3.if2 r2 = r5.f133730e
                java.lang.String r3 = r2.f135295s
                r1[r9] = r3
                java.lang.String r3 = r2.f135285f
                r1[r8] = r3
                int r2 = r2.f135299w
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r14] = r2
                java.lang.String r2 = "NetSceneSearchBLEHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), mac(%s), isEnterMainDevice(%d)."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
                goto L_0x0237
            L_0x010b:
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r7] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r1[r11] = r2
                r1[r9] = r4
                java.lang.String r2 = "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r1)
                goto L_0x0237
            L_0x0122:
                boolean r6 = r5 instanceof com.tencent.p014mm.plugin.exdevice.model.C41128f1
                if (r6 == 0) goto L_0x0237
                if (r2 != 0) goto L_0x021f
                if (r3 == 0) goto L_0x012c
                goto L_0x021f
            L_0x012c:
                com.tencent.mm.plugin.exdevice.model.f1 r5 = (com.tencent.p014mm.plugin.exdevice.model.C41128f1) r5
                ob0.c r2 = r5.f110797e
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                te3.vy3 r2 = (te3.C51757vy3) r2
                te3.hf2 r3 = r2.f143774e
                if (r3 != 0) goto L_0x0141
                java.lang.String r1 = "HardDevice info is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
                goto L_0x0237
            L_0x0141:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r4 = r1.f111022e
                java.lang.String r5 = r3.f134596d
                java.lang.String r3 = r3.f134597e
                r4.getClass()
                if (r5 == 0) goto L_0x01c2
                int r6 = r5.length()
                if (r6 == 0) goto L_0x01c2
                if (r3 == 0) goto L_0x01c2
                int r6 = r3.length()
                if (r6 != 0) goto L_0x015c
                goto L_0x01c2
            L_0x015c:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$l r6 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41245l.CONNECT_PROTO_TYPE_WIFI
                r10 = 0
            L_0x015f:
                java.util.List<com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p> r8 = r4.f111053d
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r8 = r8.size()
                if (r10 >= r8) goto L_0x01b2
                java.util.List<com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p> r8 = r4.f111053d
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r8 = r8.get(r10)
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p r8 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41249p) r8
                te3.hf2 r9 = r8.f111075e
                if (r9 == 0) goto L_0x017a
                java.lang.String r11 = r9.f134596d
                goto L_0x0184
            L_0x017a:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$l r11 = r8.f111072b
                if (r11 != r6) goto L_0x0183
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$n r11 = r8.f111074d
                java.lang.String r11 = r11.f111065a
                goto L_0x0184
            L_0x0183:
                r11 = 0
            L_0x0184:
                if (r9 == 0) goto L_0x0189
                java.lang.String r8 = r9.f134597e
                goto L_0x0193
            L_0x0189:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$l r9 = r8.f111072b
                if (r9 != r6) goto L_0x0192
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$n r8 = r8.f111074d
                java.lang.String r8 = r8.f111066b
                goto L_0x0193
            L_0x0192:
                r8 = 0
            L_0x0193:
                boolean r9 = r4.mo64310d(r11)
                if (r9 != 0) goto L_0x01ad
                boolean r9 = r4.mo64310d(r8)
                if (r9 == 0) goto L_0x01a0
                goto L_0x01ad
            L_0x01a0:
                int r9 = r5.compareTo(r11)
                if (r9 != 0) goto L_0x01ad
                int r8 = r3.compareTo(r8)
                if (r8 != 0) goto L_0x01ad
                goto L_0x01b3
            L_0x01ad:
                int r10 = r10 + 1
                r9 = 2
                r11 = 1
                goto L_0x015f
            L_0x01b2:
                r10 = -1
            L_0x01b3:
                if (r10 >= 0) goto L_0x01b6
                goto L_0x01c2
            L_0x01b6:
                java.util.List<com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p> r3 = r4.f111053d
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r10)
                r10 = r3
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p r10 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41249p) r10
                goto L_0x01c3
            L_0x01c2:
                r10 = 0
            L_0x01c3:
                if (r10 != 0) goto L_0x01c9
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r15)
                goto L_0x0237
            L_0x01c9:
                te3.hf2 r3 = r10.f111075e
                if (r3 == 0) goto L_0x01d1
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
                goto L_0x0237
            L_0x01d1:
                te3.if2 r3 = r2.f143775f
                r10.f111076f = r3
                te3.hf2 r3 = r2.f143774e
                r10.f111075e = r3
                java.lang.String r3 = r2.f143776g
                r10.f111077g = r3
                te3.jy2 r3 = r2.f143773d
                r10.f111078h = r3
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r3 = r1.f111022e
                r3.getClass()
                java.lang.String r4 = r10.mo64320b()
                int r4 = r3.mo64308a(r4)
                if (r4 >= 0) goto L_0x01f1
                goto L_0x01f7
            L_0x01f1:
                boolean r3 = r3.mo64309b(r10)
                r10.f111071a = r3
            L_0x01f7:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k r1 = r1.f111022e
                r1.notifyDataSetChanged()
                java.lang.Object[] r1 = new java.lang.Object[r14]
                te3.hf2 r3 = r2.f143774e
                java.lang.String r4 = r3.f134596d
                r1[r7] = r4
                java.lang.String r3 = r3.f134597e
                r4 = 1
                r1[r4] = r3
                te3.if2 r2 = r2.f143775f
                java.lang.String r3 = r2.f135295s
                r4 = 2
                r1[r4] = r3
                int r2 = r2.f135299w
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5 = 3
                r1[r5] = r2
                java.lang.String r2 = "NetSceneSearchWiFiHardDevice onSceneEnd, deviceType(%s) deviceId(%s), title(%s), isEnterMainDevice(%d)."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
                goto L_0x0237
            L_0x021f:
                r5 = 3
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r7] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                r1[r2] = r4
                java.lang.String r2 = "NetSceneSearchWiFiHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r1)
            L_0x0237:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41240h.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$i */
    public class C41241i extends ClickableSpan {
        public C41241i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity context = ExdeviceBindDeviceUI.this.getContext();
            C41175x.m44617c(context, HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fm4) + "/mydevice/page/deviceHelp.html");
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$j */
    public class C41242j extends ClickableSpan {
        public C41242j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$9", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceBindDeviceUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$9", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k */
    public static final class C41243k extends BaseAdapter {

        /* renamed from: d */
        public List<C41249p> f111053d = new ArrayList();

        /* renamed from: e */
        public C20937c f111054e;

        /* renamed from: f */
        public String f111055f;

        /* renamed from: g */
        public C41248o f111056g;

        /* renamed from: h */
        public String f111057h;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$k$a */
        public static class C41244a {

            /* renamed from: a */
            public TextView f111058a;

            /* renamed from: b */
            public ImageView f111059b;

            public C41244a() {
            }

            public /* synthetic */ C41244a(C41233b bVar) {
                this();
            }
        }

        public C41243k(String str, C41248o oVar, String str2) {
            this.f111055f = str;
            this.f111056g = oVar;
            this.f111057h = str2;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59361q = C0966R.color.aaz;
            this.f111054e = bVar.mo32666a();
        }

        /* renamed from: a */
        public final int mo64308a(String str) {
            for (int i = 0; i < ((ArrayList) this.f111053d).size(); i++) {
                if (((C41249p) ((ArrayList) this.f111053d).get(i)).mo64320b().compareTo(str) == 0) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r5 = r5.f111076f.f135297u;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo64309b(com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41249p r5) {
            /*
                r4 = this;
                te3.if2 r0 = r5.f111076f
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$o r2 = r4.f111056g
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$o r3 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41248o.SCAN_CATALOG
                if (r2 != r3) goto L_0x0028
                java.lang.String r0 = r0.f135283d
                if (r0 == 0) goto L_0x0027
                java.lang.String r2 = r4.f111055f
                int r0 = r0.compareTo(r2)
                if (r0 == 0) goto L_0x0019
                goto L_0x0027
            L_0x0019:
                te3.if2 r5 = r5.f111076f
                java.lang.String r5 = r5.f135297u
                if (r5 == 0) goto L_0x0027
                java.lang.String r0 = r4.f111057h
                int r5 = r5.compareTo(r0)
                if (r5 == 0) goto L_0x0031
            L_0x0027:
                return r1
            L_0x0028:
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$o r5 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41248o.SCAN_MY_DEVICE
                if (r2 != r5) goto L_0x0033
                int r5 = r0.f135299w
                if (r5 != 0) goto L_0x0031
                return r1
            L_0x0031:
                r5 = 1
                return r5
            L_0x0033:
                junit.framework.Assert.assertTrue(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceUI.C41243k.mo64309b(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p):boolean");
        }

        /* renamed from: d */
        public boolean mo64310d(String str) {
            return str == null || str.length() == 0;
        }

        /* renamed from: f */
        public boolean mo64311f(C41249p pVar) {
            if (pVar == null || mo64312g(pVar.mo64320b())) {
                return false;
            }
            pVar.f111071a = mo64309b(pVar);
            ((ArrayList) this.f111053d).add(pVar);
            return true;
        }

        /* renamed from: g */
        public boolean mo64312g(String str) {
            return mo64308a(str) >= 0;
        }

        public int getCount() {
            int i = 0;
            for (int i2 = 0; i2 < ((ArrayList) this.f111053d).size(); i2++) {
                if (((C41249p) ((ArrayList) this.f111053d).get(i2)).f111071a) {
                    i++;
                }
            }
            return i;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C41244a aVar;
            C49840if2 if22;
            C41249p h = getItem(i);
            if (view == null) {
                aVar = new C41244a((C41233b) null);
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f359659a42, (ViewGroup) null);
                aVar.f111058a = (TextView) view2.findViewById(C0966R.C0970id.h_3);
                aVar.f111059b = (ImageView) view2.findViewById(C0966R.C0970id.f1b);
                view2.setTag(aVar);
            } else {
                aVar = (C41244a) view.getTag();
                view2 = view;
            }
            if (h == null || (if22 = h.f111076f) == null) {
                Assert.assertTrue(false);
                return view2;
            }
            C41245l lVar = h.f111072b;
            String str = "";
            if (lVar == C41245l.CONNECT_PROTO_TYPE_BLUE) {
                C41246m mVar = h.f111073c;
                Log.m105919d("MicroMsg.ExdeviceBindDeviceUI", "position(%s), broadcastname(%s), mac(%s), deviceTitle(%s).", Integer.valueOf(i), mVar.f111063a, mVar.f111064b, h.f111076f.f135295s);
                String str2 = h.f111076f.f135281A;
                if (str2 == null || str2.length() < 4) {
                    String str3 = h.f111073c.f111064b;
                    if (str3 != null && str3.length() >= 4) {
                        String str4 = h.f111073c.f111064b;
                        str = str4.substring(str4.length() - 4, str4.length());
                    }
                } else {
                    str = str2.substring(str2.length() - 4, str2.length());
                }
                String str5 = h.f111076f.f135295s + " " + str;
                SpannableString spannableString = new SpannableString(str5);
                spannableString.setSpan(new ForegroundColorSpan(viewGroup.getContext().getResources().getColor(C0966R.color.f3563xt)), h.f111076f.f135295s.length() + 1, str5.length(), 17);
                aVar.f111058a.setText(spannableString);
            } else if (lVar == C41245l.CONNECT_PROTO_TYPE_WIFI) {
                String str6 = if22.f135281A;
                if (str6 == null || str6.length() < 4) {
                    String str7 = h.f111076f.f135285f;
                    if (str7 != null && str7.length() >= 4) {
                        String str8 = h.f111076f.f135285f;
                        str = str8.substring(str8.length() - 4, str8.length());
                    }
                } else {
                    str = str6.substring(str6.length() - 4, str6.length());
                }
                String str9 = h.f111076f.f135295s + " " + str;
                SpannableString spannableString2 = new SpannableString(str9);
                spannableString2.setSpan(new ForegroundColorSpan(viewGroup.getContext().getResources().getColor(C0966R.color.f3563xt)), h.f111076f.f135295s.length() + 1, str9.length(), 17);
                aVar.f111058a.setText(spannableString2);
            } else {
                Assert.assertTrue(false);
            }
            String str10 = h.f111076f.f135293q;
            if (!mo64310d(str10)) {
                C20828a.m22825b().mo32519h(str10, aVar.f111059b, this.f111054e);
            }
            return view2;
        }

        /* renamed from: h */
        public C41249p getItem(int i) {
            int i2 = -1;
            for (int i3 = 0; i3 < ((ArrayList) this.f111053d).size(); i3++) {
                if (((C41249p) ((ArrayList) this.f111053d).get(i3)).f111071a) {
                    i2++;
                }
                if (i2 == i) {
                    return (C41249p) ((ArrayList) this.f111053d).get(i3);
                }
            }
            return null;
        }

        /* renamed from: i */
        public void mo64318i() {
            for (int i = 0; i < ((ArrayList) this.f111053d).size(); i++) {
                C41249p pVar = (C41249p) ((ArrayList) this.f111053d).get(i);
                pVar.f111071a = mo64309b(pVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$l */
    public enum C41245l {
        CONNECT_PROTO_TYPE_WIFI,
        CONNECT_PROTO_TYPE_BLUE
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$m */
    public class C41246m {

        /* renamed from: a */
        public String f111063a;

        /* renamed from: b */
        public String f111064b;

        public C41246m(ExdeviceBindDeviceUI exdeviceBindDeviceUI, C41233b bVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$n */
    public class C41247n {

        /* renamed from: a */
        public String f111065a;

        /* renamed from: b */
        public String f111066b;

        public C41247n(ExdeviceBindDeviceUI exdeviceBindDeviceUI, C41233b bVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$o */
    public enum C41248o {
        SCAN_ALL,
        SCAN_MY_DEVICE,
        SCAN_CATALOG
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$p */
    public class C41249p {

        /* renamed from: a */
        public boolean f111071a = false;

        /* renamed from: b */
        public C41245l f111072b = C41245l.CONNECT_PROTO_TYPE_WIFI;

        /* renamed from: c */
        public C41246m f111073c;

        /* renamed from: d */
        public C41247n f111074d;

        /* renamed from: e */
        public C49697hf2 f111075e;

        /* renamed from: f */
        public C49840if2 f111076f;

        /* renamed from: g */
        public String f111077g;

        /* renamed from: h */
        public C50052jy2 f111078h;

        /* renamed from: i */
        public String f111079i;

        public C41249p(ExdeviceBindDeviceUI exdeviceBindDeviceUI, C41233b bVar) {
        }

        /* renamed from: a */
        public String mo64319a() {
            if (this.f111072b != C41245l.CONNECT_PROTO_TYPE_WIFI) {
                return this.f111073c.f111064b;
            }
            C49840if2 if22 = this.f111076f;
            if (if22 == null) {
                return null;
            }
            return if22.f135285f;
        }

        /* renamed from: b */
        public String mo64320b() {
            if (this.f111072b != C41245l.CONNECT_PROTO_TYPE_WIFI) {
                return this.f111073c.f111064b;
            }
            return this.f111074d.f111065a + this.f111074d.f111066b;
        }
    }

    /* renamed from: H7 */
    public static void m44655H7(ExdeviceBindDeviceUI exdeviceBindDeviceUI, C41249p pVar) {
        exdeviceBindDeviceUI.getClass();
        Intent intent = new Intent(exdeviceBindDeviceUI, ExdeviceDeviceProfileUI.class);
        C49840if2 if22 = pVar.f111076f;
        intent.putExtra("device_mac", if22.f135285f);
        intent.putExtra("device_brand_name", if22.f135283d);
        intent.putExtra("device_desc", if22.f135296t);
        intent.putExtra("device_title", if22.f135295s);
        intent.putExtra("device_icon_url", if22.f135293q);
        intent.putExtra("device_alias", if22.f135292p);
        intent.putExtra("device_jump_url", if22.f135294r);
        intent.putExtra("bind_ticket", pVar.f111077g);
        intent.putExtra("device_type", pVar.f111075e.f134596d);
        intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, pVar.f111075e.f134597e);
        intent.putExtra("hide_device_panel", true);
        intent.putExtra("subscribe_flag", 0);
        C41245l lVar = pVar.f111072b;
        if (lVar == C41245l.CONNECT_PROTO_TYPE_BLUE) {
            intent.putExtra("device_ble_simple_proto", if22.f135300x);
        } else if (lVar != C41245l.CONNECT_PROTO_TYPE_WIFI) {
            Assert.assertTrue(false);
            return;
        }
        exdeviceBindDeviceUI.startActivityForResult(intent, 0);
    }

    /* renamed from: F4 */
    public void mo64188F4(String str, int i, long j) {
    }

    /* renamed from: I7 */
    public void mo64294I7(C41249p pVar) {
        if (!this.f111022e.mo64312g(pVar.mo64320b())) {
            Log.m105918d("MicroMsg.ExdeviceBindDeviceUI", "Add device: " + pVar.mo64319a());
            this.f111022e.mo64311f(pVar);
            this.f111022e.notifyDataSetChanged();
            C41245l lVar = pVar.f111072b;
            if (lVar == C41245l.CONNECT_PROTO_TYPE_BLUE) {
                Log.m105925i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice doScene, mac(%s), brandName(%s),categoryId(%s)", pVar.f111073c.f111064b, this.f111033s, this.f111032r);
                C86709a0.m107529k().mo121127b().mo123460f(new C41123d1(pVar.f111073c.f111064b, this.f111033s, this.f111032r));
            } else if (lVar == C41245l.CONNECT_PROTO_TYPE_WIFI) {
                C41247n nVar = pVar.f111074d;
                Log.m105925i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice doScene, deviceType(%s), deviceId(%s)", nVar.f111065a, nVar.f111066b);
                C89137b0 b = C86709a0.m107529k().mo121127b();
                C41247n nVar2 = pVar.f111074d;
                b.mo123460f(new C41128f1(nVar2.f111065a, nVar2.f111066b, pVar.f111079i));
            } else {
                Assert.assertTrue(false);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo64295J7(int i) {
        int i2 = i;
        if (i2 == 0) {
            String string = getString(C0966R.string.cc9);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(C0966R.color.a1d), 0, string.length(), 33);
            spannableString.setSpan(new C41241i(), 0, string.length(), 33);
            this.f111025h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f111025h.setText(spannableString);
        } else if (i2 == 1) {
            String string2 = getString(C0966R.string.ccd);
            String string3 = getString(C0966R.string.cd6);
            SpannableString spannableString2 = new SpannableString(string2 + string3);
            spannableString2.setSpan(new ForegroundColorSpan(C0966R.color.a1d), string2.length(), string2.length() + string3.length(), 33);
            spannableString2.setSpan(new C41232a(), string2.length(), string2.length() + string3.length(), 33);
            this.f111025h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f111025h.setText(spannableString2);
        } else if (i2 == 2) {
            String string4 = getString(C0966R.string.ccc);
            String string5 = getString(C0966R.string.cc_);
            SpannableString spannableString3 = new SpannableString(string4 + string5);
            spannableString3.setSpan(new ForegroundColorSpan(C0966R.color.a1d), string4.length(), string4.length() + string5.length(), 33);
            spannableString3.setSpan(new C41242j(), string4.length(), string4.length() + string5.length(), 33);
            this.f111025h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f111025h.setText(spannableString3);
        }
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
            this.f111026i.setImageResource(C0966R.raw.bluetooth_logo);
            this.f111028n.setText(C0966R.string.ccl);
            this.f111029o.setText(C0966R.string.cc6);
        } else if (i2 == 4) {
            this.f111026i.setImageResource(C0966R.raw.bluetooth_logo);
            this.f111028n.setText(C0966R.string.ccj);
            this.f111029o.setText("");
        } else if (i2 == 5) {
            this.f111026i.setImageResource(C0966R.raw.wifi_logo);
            this.f111028n.setText(C0966R.string.ccl);
            this.f111029o.setText(C0966R.string.ccg);
        }
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            View view = this.f111023f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f111021d.setVisibility(0);
            this.f111025h.setVisibility(0);
            this.f111026i.setVisibility(8);
            this.f111028n.setVisibility(8);
            this.f111029o.setVisibility(8);
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            this.f111027j.setVisibility(8);
            View view3 = this.f111023f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f111021d.setVisibility(8);
            this.f111025h.setVisibility(8);
            this.f111026i.setVisibility(0);
            this.f111028n.setVisibility(0);
            if (i2 == 4) {
                this.f111029o.setVisibility(8);
            } else {
                this.f111029o.setVisibility(0);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359660a43;
    }

    /* renamed from: h1 */
    public void mo64189h1(String str, byte[] bArr, boolean z) {
    }

    public void initView() {
        this.f111021d = (ListView) findViewById(C0966R.C0970id.fph);
        View inflate = View.inflate(this, C0966R.C0971layout.a45, (ViewGroup) null);
        View inflate2 = View.inflate(this, C0966R.C0971layout.f359664a53, (ViewGroup) null);
        this.f111030p = inflate2;
        this.f111023f = inflate2.findViewById(C0966R.C0970id.j78);
        this.f111024g = (TextView) this.f111030p.findViewById(C0966R.C0970id.kmy);
        this.f111025h = (TextView) findViewById(C0966R.C0970id.j17);
        this.f111026i = (ImageView) findViewById(C0966R.C0970id.g6l);
        this.f111028n = (TextView) findViewById(C0966R.C0970id.ckn);
        this.f111029o = (TextView) findViewById(C0966R.C0970id.cko);
        this.f111027j = (ScrollView) findViewById(C0966R.C0970id.c47);
        this.f111021d.addHeaderView(inflate, (Object) null, false);
        this.f111021d.addFooterView(this.f111030p, (Object) null, false);
        C41243k kVar = new C41243k(this.f111033s, this.f111031q, this.f111032r);
        this.f111022e = kVar;
        this.f111021d.setAdapter(kVar);
        this.f111021d.setOnItemClickListener(new C41237e());
        if (this.f111037w && !this.f111036v) {
            if (!C47887a.m53195b(getContext())) {
                Log.m105925i("MicroMsg.ExdeviceBindDeviceUI", "now sdk version not support ble device : %d", Integer.valueOf(Build.VERSION.SDK_INT));
                mo64295J7(4);
                return;
            } else if (!C47887a.m53196c()) {
                Log.m105924i("MicroMsg.ExdeviceBindDeviceUI", "Bluetooth is not open, Just leave");
                mo64295J7(3);
                return;
            }
        }
        if (this.f111037w || !this.f111036v || NetStatusUtil.isWifi((Context) getContext())) {
            C41248o oVar = this.f111031q;
            if (oVar == C41248o.SCAN_MY_DEVICE) {
                mo64295J7(0);
            } else if (oVar == C41248o.SCAN_CATALOG) {
                boolean z = this.f111037w;
                if (z && this.f111036v) {
                    Assert.assertTrue(false);
                    mo64295J7(1);
                } else if (z) {
                    mo64295J7(2);
                } else if (this.f111036v) {
                    mo64295J7(1);
                }
            } else if (oVar == C41248o.SCAN_ALL) {
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(false);
            }
        } else {
            Log.m105924i("MicroMsg.ExdeviceBindDeviceUI", "wifi is not open, Just leave");
            mo64295J7(5);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f111022e.mo64318i();
        this.f111022e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        String str;
        C41248o oVar = C41248o.SCAN_CATALOG;
        C41248o oVar2 = C41248o.SCAN_MY_DEVICE;
        super.onCreate(bundle);
        setBackBtn(new C41233b());
        Intent intent = getIntent();
        this.f111032r = intent.getStringExtra("device_category_id");
        this.f111033s = intent.getStringExtra("device_brand_name");
        String stringExtra = intent.getStringExtra("device_type");
        if (stringExtra != null) {
            int length = stringExtra.length();
        }
        String stringExtra2 = intent.getStringExtra("device_scan_conn_proto");
        String stringExtra3 = intent.getStringExtra("device_scan_mode");
        String stringExtra4 = intent.getStringExtra("device_title");
        if (Util.isNullOrNil(stringExtra4)) {
            stringExtra4 = getContext().getString(C0966R.string.cdk);
        }
        if (stringExtra3.contains("SCAN_MY_DEVICE")) {
            this.f111031q = oVar2;
            str = getContext().getString(C0966R.string.cbw);
        } else if (stringExtra3.compareTo("SCAN_CATALOG") == 0) {
            this.f111031q = oVar;
            str = getContext().getString(C0966R.string.cbu);
        } else {
            Assert.assertTrue(false);
            str = "";
        }
        setMMTitle(str);
        C41248o oVar3 = this.f111031q;
        if (oVar3 == oVar) {
            this.f111036v = stringExtra2.contains("wifi");
            this.f111037w = stringExtra2.contains("blue");
            Log.m105925i("MicroMsg.ExdeviceBindDeviceUI", "mIsScanWifi(%b), mIsScanBlue(%b)", Boolean.valueOf(this.f111036v), Boolean.valueOf(this.f111037w));
        } else if (oVar3 == oVar2) {
            this.f111037w = true;
            this.f111036v = true;
        }
        this.f111034t = new C41234c();
        this.f111035u = new C41236d(this);
        initView();
        this.f111024g.setText(getContext().getString(C0966R.string.cfi, new Object[]{stringExtra4}));
        C86709a0.m107529k().mo121127b().mo123455a(1264, this);
        C86709a0.m107529k().mo121127b().mo123455a(1706, this);
        C86709a0.m107529k().mo121127b().mo123455a(1270, this);
        C86709a0.m107529k().mo121127b().mo123455a(1719, this);
        if (this.f111037w) {
            C41166r1.yx0().mo64185r(this);
        }
        if (this.f111036v) {
            C2242s0.m2051a().mo2132c(10, this.f111034t);
            C2242s0.m2051a().mo2132c(11, this.f111035u);
            Java2CExDevice.initWCLanDeviceLib();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f111036v) {
            C86709a0.m107525e().postToWorker(new C41238f(this));
            C2242s0.m2051a().mo2133d(10, this.f111034t);
            C2242s0.m2051a().mo2133d(11, this.f111035u);
        }
        if (this.f111037w) {
            boolean remove = ((LinkedList) C41166r1.yx0().f110715a).remove(this);
            C41166r1.zx0().mo64195e();
        }
        C86709a0.m107529k().f251779b.mo123470p(1264, this);
        C86709a0.m107529k().f251779b.mo123470p(1706, this);
        C86709a0.m107529k().f251779b.mo123470p(1270, this);
        C86709a0.m107529k().f251779b.mo123470p(1719, this);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.ExdeviceBindDeviceUI", "onPause stop scan.");
        if (this.f111036v) {
            Java2CExDevice.stopScanWCLanDevice();
        }
        if (this.f111037w) {
            C41166r1.zx0().mo64195e();
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.ExdeviceBindDeviceUI", "onResume start scan.");
        if (this.f111037w) {
            C41166r1.yx0().mo64174f();
        }
        if (this.f111036v) {
            Java2CExDevice.startScanWCLanDevice(new byte[0], 1000);
        }
        this.f111022e.mo64318i();
        this.f111022e.notifyDataSetChanged();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar == null) {
            Log.m105920e("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, scene is null.");
        } else {
            MMHandlerThread.postToMainThread(new C41240h(i, i2, str, yVar));
        }
    }

    /* renamed from: v2 */
    public void mo64190v2(String str, String str2, boolean z) {
        Log.m105919d("MicroMsg.ExdeviceBindDeviceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, Boolean.valueOf(z));
        if (Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.ExdeviceBindDeviceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, Boolean.valueOf(z));
            return;
        }
        C41249p pVar = new C41249p(this, (C41233b) null);
        pVar.f111072b = C41245l.CONNECT_PROTO_TYPE_BLUE;
        C41246m mVar = new C41246m(this, (C41233b) null);
        pVar.f111073c = mVar;
        mVar.f111063a = str;
        mVar.f111064b = C45288e.m50136g(C45288e.m50137h(str2));
        MMHandlerThread.postToMainThread(new C41239g(pVar));
    }
}
