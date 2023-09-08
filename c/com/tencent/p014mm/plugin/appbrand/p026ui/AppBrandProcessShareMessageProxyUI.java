package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import kb0.C76529i;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C77398g;
import qo3.C89779i0;
import wd3.C65953v0;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI */
public class AppBrandProcessShareMessageProxyUI extends MMActivity {

    /* renamed from: d */
    public C77398g f197177d;

    /* renamed from: e */
    public C68639a f197178e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$1 */
    class C19761 extends ResultReceiver {
        public void onReceiveResult(int i, Bundle bundle) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$a */
    public class C68639a implements C65953v0 {

        /* renamed from: a */
        public boolean f197179a = false;

        public C68639a() {
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                mo94354b(-1, str);
            } else {
                mo94354b(-2, (String) null);
            }
        }

        /* renamed from: b */
        public final void mo94354b(int i, String str) {
            if (!this.f197179a) {
                this.f197179a = true;
                ResultReceiver resultReceiver = (ResultReceiver) AppBrandProcessShareMessageProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
                if (resultReceiver != null) {
                    Bundle bundle = null;
                    if (!Util.isNullOrNil(str)) {
                        bundle = new Bundle();
                        bundle.putString(StateEvent.Name.MESSAGE, str);
                    }
                    resultReceiver.send(i, bundle);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$b */
    public interface C68640b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$c */
    public class C68641c {

        /* renamed from: a */
        public Context f197181a;

        /* renamed from: b */
        public C89779i0 f197182b;

        /* renamed from: c */
        public boolean f197183c;

        /* renamed from: d */
        public boolean f197184d;

        /* renamed from: e */
        public boolean f197185e;

        /* renamed from: f */
        public String f197186f;

        /* renamed from: g */
        public int f197187g;

        /* renamed from: h */
        public C68640b f197188h;

        /* renamed from: i */
        public Runnable f197189i = new C68642a();

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$c$a */
        public class C68642a implements Runnable {
            public C68642a() {
            }

            public void run() {
                C89779i0 i0Var = C68641c.this.f197182b;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C68641c.this.mo94355a();
            }
        }

        public C68641c(AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, Context context) {
            this.f197181a = context;
        }

        /* renamed from: a */
        public void mo94355a() {
            C68640b bVar = this.f197188h;
            if (bVar != null) {
                boolean z = this.f197185e;
                String str = this.f197186f;
                int i = this.f197187g;
                C68660z0 z0Var = (C68660z0) bVar;
                z0Var.getClass();
                Log.m105925i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onProcessDone, result:%b", Boolean.valueOf(z));
                C68639a aVar = z0Var.f197216c.f197178e;
                if (aVar != null) {
                    aVar.mo23a(z, str, i);
                }
                ((C76529i) C86312j.m106911c(C76529i.class)).ks0(z0Var.f197214a, z0Var.f197215b);
            }
        }

        /* renamed from: b */
        public void mo94356b(boolean z, String str, int i) {
            boolean z2 = true;
            this.f197183c = true;
            this.f197185e = z;
            this.f197186f = str;
            this.f197187g = i;
            if (!this.f197184d) {
                z2 = false;
            }
            if (z2) {
                mo94355a();
            } else if (z) {
                Context context = this.f197181a;
                this.f197182b = C76879j.m92723Q(context, "", context.getString(C0966R.string.a2w), false, true, (DialogInterface.OnCancelListener) null);
                MMHandlerThread.postToMainThreadDelayed(this.f197189i, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r6 = r30
            super.onCreate(r31)
            r0 = 0
            r6.overridePendingTransition(r0, r0)
            android.view.Window r1 = r30.getWindow()
            com.tencent.p014mm.p136ui.C85864g1.m106129d(r1)
            android.view.Window r1 = r30.getWindow()
            com.tencent.p014mm.p136ui.C85864g1.m106127b(r1, r0)
            android.view.Window r1 = r30.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r0)
            r1.setBackgroundDrawable(r2)
            android.content.Intent r1 = r30.getIntent()
            if (r1 != 0) goto L_0x002e
            r30.finish()
            goto L_0x027c
        L_0x002e:
            java.lang.Class<kb0.i> r1 = kb0.C76529i.class
            android.content.Intent r2 = r30.getIntent()
            java.lang.String r3 = "key_dialog_touser"
            java.lang.String r2 = r2.getStringExtra(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r7 = 1
            if (r3 == 0) goto L_0x0043
            goto L_0x0277
        L_0x0043:
            android.content.Intent r3 = r30.getIntent()
            java.lang.String r4 = "key_dialog_params"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "is_video"
            java.lang.Object r5 = r3.get(r4)
            boolean r5 = eb0.C75571d6.m90695a(r5, r0)
            java.lang.String r8 = "type"
            java.lang.Object r8 = r3.get(r8)
            int r8 = eb0.C75571d6.m90696b(r8, r7)
            java.lang.String r9 = "title"
            java.lang.Object r10 = r3.get(r9)
            java.lang.String r11 = ""
            java.lang.String r10 = eb0.C75571d6.m90697c(r10, r11)
            java.lang.String r12 = "img_url"
            java.lang.Object r12 = r3.get(r12)
            r13 = 0
            java.lang.String r12 = eb0.C75571d6.m90697c(r12, r13)
            r14 = 2
            if (r8 == r14) goto L_0x0086
            r15 = 3
            if (r8 != r15) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r10 = 1
            goto L_0x0276
        L_0x0086:
            java.lang.String r8 = "pkg_type"
            java.lang.Object r8 = r3.get(r8)
            int r8 = eb0.C75571d6.m90696b(r8, r0)
            java.lang.String r15 = "pkg_version"
            java.lang.Object r7 = r3.get(r15)
            int r7 = eb0.C75571d6.m90696b(r7, r0)
            java.lang.String r14 = "app_id"
            java.lang.Object r0 = r3.get(r14)
            java.lang.String r0 = eb0.C75571d6.m90697c(r0, r13)
            r16 = r2
            java.lang.String r2 = "cache_key"
            r17 = r9
            java.lang.Object r9 = r3.get(r2)
            java.lang.String r9 = eb0.C75571d6.m90697c(r9, r13)
            r18 = r2
            java.lang.String r2 = "path"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = eb0.C75571d6.m90697c(r2, r13)
            r19 = r2
            java.lang.String r2 = "delay_load_img_path"
            r20 = r9
            java.lang.Object r9 = r3.get(r2)
            java.lang.String r9 = eb0.C75571d6.m90697c(r9, r13)
            java.lang.String r13 = "nickname"
            java.lang.Object r13 = r3.get(r13)
            java.lang.String r13 = eb0.C75571d6.m90697c(r13, r11)
            r21 = r2
            java.lang.String r2 = "is_dynamic"
            java.lang.Object r2 = r3.get(r2)
            r22 = r9
            r9 = 0
            boolean r2 = eb0.C75571d6.m90695a(r2, r9)
            java.lang.String r9 = "biz"
            java.lang.Object r9 = r3.get(r9)
            r23 = r10
            r10 = 2
            int r9 = eb0.C75571d6.m90696b(r9, r10)
            boolean r10 = com.tencent.p014mm.message.C68070l.C68071a.m80416b(r9)
            r24 = r2
            java.lang.String r2 = "MicroMsg.AppBrandProcessShareMessageProxyUI"
            r25 = r12
            java.lang.String r12 = "key_footer_icon"
            r26 = r15
            java.lang.String r15 = "key_footer_text"
            if (r10 == 0) goto L_0x014e
            java.lang.String r10 = "tail_lang"
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = eb0.C75571d6.m90697c(r10, r11)
            r27 = r7
            java.lang.String r7 = "icon_url"
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = eb0.C75571d6.m90697c(r7, r11)
            r28 = r8
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r29 = r0
            java.lang.String r0 = "key_biz"
            r8.putInt(r0, r9)
            java.lang.String r0 = "key_footer_text_default"
            r8.putString(r0, r13)
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68071a.m80415a(r9, r10, r0)
            r8.putString(r15, r0)
            r8.putString(r12, r7)
            r0 = 2
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r7[r0] = r13
            r0 = 1
            r7[r0] = r10
            java.lang.String r9 = "defaultFooterTxt: %s, tailLang: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r7)
            goto L_0x0179
        L_0x014e:
            r29 = r0
            r27 = r7
            r28 = r8
            r0 = 1
            if (r5 == 0) goto L_0x017c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r8.putBoolean(r4, r0)
            java.lang.String r2 = "footer_icon"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = eb0.C75571d6.m90697c(r2, r11)
            java.lang.String r7 = "footer_text"
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = eb0.C75571d6.m90697c(r7, r11)
            r8.putString(r12, r2)
            r8.putString(r15, r7)
        L_0x0179:
            r0 = r8
            r8 = 0
            goto L_0x018b
        L_0x017c:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r8 = 0
            r7[r8] = r0
            java.lang.String r0 = "fake native share msg biz invalidate, biz: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r7)
            r0 = 0
        L_0x018b:
            di3.d r2 = di3.C86312j.m106911c(r1)
            kb0.i r2 = (kb0.C76529i) r2
            r7 = 0
            android.view.View r7 = r2.mo106760I7(r6, r0, r8, r7)
            java.lang.String r9 = js0.C9515s.m9209a(r30)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = r29
            r0.putString(r14, r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r28)
            r2[r8] = r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            r10 = 1
            r2[r10] = r8
            java.lang.String r8 = "%d-%d"
            java.lang.String r2 = java.lang.String.format(r8, r2)
            java.lang.String r8 = "msg_id"
            r0.putString(r8, r2)
            java.lang.String r2 = "msg_pkg_type"
            r8 = r28
            r0.putInt(r2, r8)
            r2 = r26
            r8 = r27
            r0.putInt(r2, r8)
            java.lang.String r2 = "image_url"
            r8 = r25
            r0.putString(r2, r8)
            java.lang.String r2 = "is_dynamic_page"
            r8 = r24
            r0.putBoolean(r2, r8)
            r2 = r17
            r8 = r23
            r0.putString(r2, r8)
            r2 = r18
            r8 = r20
            r0.putString(r2, r8)
            java.lang.String r2 = "msg_path"
            r8 = r19
            r0.putString(r2, r8)
            r2 = r21
            r8 = r22
            r0.putString(r2, r8)
            if (r5 == 0) goto L_0x021a
            java.lang.String r2 = "video_path"
            java.lang.Object r5 = r3.get(r2)
            java.lang.String r5 = eb0.C75571d6.m90697c(r5, r11)
            java.lang.String r8 = "video_thumb_path"
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = eb0.C75571d6.m90697c(r3, r11)
            r10 = 1
            r0.putBoolean(r4, r10)
            r0.putString(r2, r5)
            r0.putString(r8, r3)
            goto L_0x021b
        L_0x021a:
            r10 = 1
        L_0x021b:
            com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$c r8 = new com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$c
            r8.<init>(r6, r6)
            com.tencent.mm.plugin.appbrand.ui.z0 r2 = new com.tencent.mm.plugin.appbrand.ui.z0
            r2.<init>(r6, r9, r7)
            r8.f197188h = r2
            di3.d r1 = di3.C86312j.m106911c(r1)
            kb0.i r1 = (kb0.C76529i) r1
            com.tencent.mm.plugin.appbrand.ui.a1 r2 = new com.tencent.mm.plugin.appbrand.ui.a1
            r2.<init>(r6, r8)
            r1.sh0(r9, r7, r0, r2)
            com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$a r0 = new com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI$a
            r0.<init>()
            r6.f197178e = r0
            java.lang.Class<wc3.w> r0 = wc3.C78541w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wc3.w r0 = (wc3.C78541w) r0
            android.content.res.Resources r1 = r30.getResources()
            r2 = 2131821954(0x7f110582, float:1.9276666E38)
            java.lang.String r4 = r1.getString(r2)
            com.tencent.mm.plugin.appbrand.ui.b1 r5 = new com.tencent.mm.plugin.appbrand.ui.b1
            r5.<init>(r6, r8)
            r1 = r30
            r2 = r16
            r3 = r7
            qo3.g r0 = r0.jb0(r1, r2, r3, r4, r5)
            r6.f197177d = r0
            com.tencent.mm.plugin.appbrand.ui.c1 r1 = new com.tencent.mm.plugin.appbrand.ui.c1
            r1.<init>(r6, r9, r7)
            r0.setOnDismissListener(r1)
            qo3.g r0 = r6.f197177d
            com.tencent.mm.plugin.appbrand.ui.d1 r1 = new com.tencent.mm.plugin.appbrand.ui.d1
            r1.<init>(r6, r8)
            r0.setOnKeyListener(r1)
            qo3.g r0 = r6.f197177d
            r0.show()
        L_0x0276:
            r0 = 1
        L_0x0277:
            if (r0 != 0) goto L_0x027c
            r30.finish()
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProcessShareMessageProxyUI.onCreate(android.os.Bundle):void");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    public void onDestroy() {
        super.onDestroy();
        C77398g gVar = this.f197177d;
        if (gVar != null && gVar.isShowing()) {
            this.f197177d.dismiss();
            this.f197177d = null;
            this.f197178e = null;
        }
    }

    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
