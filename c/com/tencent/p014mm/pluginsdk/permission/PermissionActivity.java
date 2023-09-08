package com.tencent.p014mm.pluginsdk.permission;

import android.animation.Animator;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import lu3.C34379c;
import nd3.C88929c;
import nd3.C88930e;
import nd3.C88931f;
import nj3.C76879j;
import p910lj.C76701a;
import p918s2.C90111a;

@C85927s.C85929b
/* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity */
public class PermissionActivity extends MMBaseActivity {

    /* renamed from: r */
    public static final /* synthetic */ int f249544r = 0;

    /* renamed from: e */
    public String[] f249545e;

    /* renamed from: f */
    public String f249546f;

    /* renamed from: g */
    public int f249547g;

    /* renamed from: h */
    public boolean f249548h;

    /* renamed from: i */
    public int f249549i;

    /* renamed from: j */
    public Intent f249550j;

    /* renamed from: n */
    public String f249551n;

    /* renamed from: o */
    public String f249552o;

    /* renamed from: p */
    public String f249553p;

    /* renamed from: q */
    public C34379c f249554q;

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity$a */
    public class C6662a implements Runnable {
        public C6662a() {
        }

        public void run() {
            View findViewById = PermissionActivity.this.findViewById(C0966R.C0970id.a8a);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity$b */
    public class C85614b implements DialogInterface.OnClickListener {
        public C85614b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                Log.m105924i("MicroMsg.PermissionActivity", "START_SETTINGS_REQUEST click ok");
                PermissionActivity permissionActivity = PermissionActivity.this;
                permissionActivity.startActivityForResult(permissionActivity.f249550j, 1);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", Integer.valueOf(PermissionActivity.this.f249549i), e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity$c */
    public class C85615c implements DialogInterface.OnClickListener {
        public C85615c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionActivity.this.finish();
            C88931f remove = C88929c.f256474b.remove(PermissionActivity.this.f249546f);
            if (remove != null) {
                remove.mo62503a(PermissionActivity.this.f249547g, 0, (Intent) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity$d */
    public class C85616d implements DialogInterface.OnClickListener {
        public C85616d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations ");
            PermissionActivity permissionActivity = PermissionActivity.this;
            int i2 = PermissionActivity.f249544r;
            permissionActivity.getClass();
            Log.m105924i("MicroMsg.PermissionActivity", "goIgnoreBatteryOptimizations()");
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            try {
                permissionActivity.startActivityForResult(intent.setData(Uri.parse("package:" + permissionActivity.getPackageName())), 1);
                if (C28862c.m38400a().getBoolean("954_93_first", true)) {
                    C117407d.INSTANCE.idkeyStat(954, 93, 1, false);
                    C28862c.m38400a().edit().putBoolean("954_93_first", false);
                }
                C117407d.INSTANCE.idkeyStat(954, 94, 1, false);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", Integer.valueOf(permissionActivity.f249549i), e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity$e */
    public class C85617e implements DialogInterface.OnClickListener {
        public C85617e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations app_cancel");
            PermissionActivity.this.finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        Log.m105925i("MicroMsg.PermissionActivity", "onActivityResult(),  scene=%d, requestCode=%d, resultCode=%d", Integer.valueOf(this.f249549i), Integer.valueOf(i), Integer.valueOf(i2));
        int i4 = this.f249549i;
        if (i4 == 2) {
            C88931f remove = C88929c.f256474b.remove(this.f249546f);
            if (remove != null) {
                remove.mo62503a(i, i3, intent);
            }
            finish();
        } else if (i4 == 3) {
            if (i3 == -1) {
                Intent intent2 = this.f249550j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.h9q, 1).show();
            }
            finish();
        } else if (i4 != 4) {
            finish();
        } else if (Build.VERSION.SDK_INT >= 23) {
            boolean b = C28862c.m38401b(this);
            if (b) {
                if (C28862c.m38400a().getBoolean("954_84_first", true)) {
                    C117407d.INSTANCE.idkeyStat(954, 84, 1, false);
                    C28862c.m38400a().edit().putBoolean("954_84_first", false);
                }
                C28862c.m38405f(true);
            }
            Log.m105925i("MicroMsg.PermissionActivity", "onActivityResult ADD_IGNORING_BATTERY_OPTIMIZATIONS result=%s", Boolean.valueOf(b));
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0378 A[LOOP:0: B:115:0x0376->B:116:0x0378, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<bh3.k> r1 = bh3.C113177k.class
            wc3.C78538u.m94870f(r17)
            super.onCreate(r18)
            android.view.Window r2 = r17.getWindow()
            com.tencent.p014mm.p136ui.C85875k4.m106177d0(r2)
            android.view.Window r2 = r17.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r3)
            android.view.Window r2 = r17.getWindow()
            r3 = 0
            r2.setStatusBarColor(r3)
            android.content.Intent r2 = r17.getIntent()
            if (r2 == 0) goto L_0x03d6
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r4 = "scene"
            boolean r2 = r2.hasExtra(r4)
            if (r2 != 0) goto L_0x003b
            goto L_0x03d6
        L_0x003b:
            r2 = 1
            r0.f249548h = r2
            android.content.Intent r5 = r17.getIntent()
            int r4 = r5.getIntExtra(r4, r2)
            r0.f249549i = r4
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r5 = "reasonTitle"
            java.lang.String r4 = r4.getStringExtra(r5)
            r0.f249551n = r4
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r5 = "reasonMsg"
            java.lang.String r4 = r4.getStringExtra(r5)
            r0.f249552o = r4
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r5 = "forceReasonMsg"
            java.lang.String r4 = r4.getStringExtra(r5)
            r0.f249553p = r4
            java.lang.String r4 = r0.f249551n
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r5 = 3
            java.lang.String r6 = "MicroMsg.PermissionActivity"
            r7 = 2
            if (r4 != 0) goto L_0x009a
            java.lang.String r4 = r0.f249552o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x009a
            java.lang.Object[] r4 = new java.lang.Object[r5]
            int r8 = r0.f249549i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r3] = r8
            java.lang.String r8 = r0.f249551n
            r4[r2] = r8
            java.lang.String r8 = r0.f249552o
            r4[r7] = r8
            java.lang.String r8 = "scene: %d, reasonTitle: %s, reasonMsg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
        L_0x009a:
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r8 = "key"
            java.lang.String r4 = r4.getStringExtra(r8)
            r0.f249546f = r4
            int r4 = r0.f249549i
            if (r4 != r2) goto L_0x038c
            r0.overridePendingTransition(r3, r3)
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r8 = "permission"
            java.lang.String[] r4 = r4.getStringArrayExtra(r8)
            r0.f249545e = r4
            android.content.Intent r4 = r17.getIntent()
            java.lang.String r8 = "requestCode"
            int r4 = r4.getIntExtra(r8, r3)
            r0.f249547g = r4
            java.lang.String[] r4 = r0.f249545e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r4)
            if (r4 != 0) goto L_0x00ef
            java.lang.Object[] r4 = new java.lang.Object[r5]
            int r5 = r0.f249549i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String[] r5 = r0.f249545e
            java.lang.String r5 = r5.toString()
            r4[r2] = r5
            int r5 = r0.f249547g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            java.lang.String r5 = "scene: %d, permission: %s, requestCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
        L_0x00ef:
            r4 = 2131496960(0x7f0c1000, float:1.86175E38)
            r0.setContentView(r4)
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.pluginsdk.permission.PermissionActivity$a r5 = new com.tencent.mm.pluginsdk.permission.PermissionActivity$a
            r5.<init>()
            r8 = 500(0x1f4, double:2.47E-321)
            zt3.j r4 = (zt3.C119157j) r4
            r4.getClass()
            lu3.c r4 = r4.mo183892w(r5, r8, r3)
            r0.f249554q = r4
            java.lang.String[] r4 = r0.f249545e
            if (r4 == 0) goto L_0x03d5
            int r4 = r4.length
            if (r4 <= 0) goto L_0x03d5
            r4 = 2131306160(0x7f0926b0, float:1.8230511E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r5 = r17.getResources()
            java.lang.String[] r6 = r0.f249545e
            r6 = r6[r3]
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r9 = r8.equals(r6)
            java.lang.String r11 = "android.permission.ACTIVITY_RECOGNITION"
            java.lang.String r12 = "android.permission.READ_CONTACTS"
            java.lang.String r13 = "android.permission.CAMERA"
            java.lang.String r14 = "android.permission.RECORD_AUDIO"
            java.lang.String r15 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r10 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            if (r9 != 0) goto L_0x0177
            boolean r9 = r2.equals(r6)
            if (r9 == 0) goto L_0x013e
            goto L_0x0177
        L_0x013e:
            boolean r9 = r10.equals(r6)
            if (r9 != 0) goto L_0x0173
            boolean r9 = r15.equals(r6)
            if (r9 == 0) goto L_0x014b
            goto L_0x0173
        L_0x014b:
            boolean r9 = r14.equals(r6)
            if (r9 == 0) goto L_0x0155
            r6 = 2131756085(0x7f100435, float:1.9143068E38)
            goto L_0x017a
        L_0x0155:
            boolean r9 = r13.equals(r6)
            if (r9 == 0) goto L_0x015f
            r6 = 2131755971(0x7f1003c3, float:1.9142836E38)
            goto L_0x017a
        L_0x015f:
            boolean r9 = r12.equals(r6)
            if (r9 == 0) goto L_0x0169
            r6 = 2131755996(0x7f1003dc, float:1.9142887E38)
            goto L_0x017a
        L_0x0169:
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0177
            r6 = 2131756453(0x7f1005a5, float:1.9143814E38)
            goto L_0x017a
        L_0x0173:
            r6 = 2131756040(0x7f100408, float:1.9142976E38)
            goto L_0x017a
        L_0x0177:
            r6 = 2131756073(0x7f100429, float:1.9143043E38)
        L_0x017a:
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            com.tencent.p014mm.p136ui.C74933u4.m89769f(r5, r6)
            r4.setImageDrawable(r5)
            r4 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131823989(0x7f110d75, float:1.9280793E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r7 = r0.f249553p
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x01a7
            r7 = 2131823953(0x7f110d51, float:1.928072E38)
            java.lang.String r7 = r0.getString(r7)
            goto L_0x01a8
        L_0x01a7:
            r7 = r9
        L_0x01a8:
            r6[r3] = r7
            java.lang.String[] r7 = r0.f249545e
            r7 = r7[r3]
            java.lang.String r3 = r0.f249551n
            boolean r16 = r8.equals(r7)
            if (r16 != 0) goto L_0x020a
            boolean r16 = r2.equals(r7)
            if (r16 == 0) goto L_0x01bd
            goto L_0x020a
        L_0x01bd:
            boolean r16 = r10.equals(r7)
            if (r16 != 0) goto L_0x0202
            boolean r16 = r15.equals(r7)
            if (r16 == 0) goto L_0x01ca
            goto L_0x0202
        L_0x01ca:
            boolean r16 = r14.equals(r7)
            if (r16 == 0) goto L_0x01d8
            r3 = 2131823984(0x7f110d70, float:1.9280783E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0211
        L_0x01d8:
            boolean r16 = r13.equals(r7)
            if (r16 == 0) goto L_0x01e6
            r3 = 2131823974(0x7f110d66, float:1.9280763E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0211
        L_0x01e6:
            boolean r16 = r12.equals(r7)
            if (r16 == 0) goto L_0x01f4
            r3 = 2131823975(0x7f110d67, float:1.9280765E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0211
        L_0x01f4:
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0211
            r3 = 2131823985(0x7f110d71, float:1.9280785E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0211
        L_0x0202:
            r3 = 2131823987(0x7f110d73, float:1.928079E38)
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0211
        L_0x020a:
            r3 = 2131823976(0x7f110d68, float:1.9280767E38)
            java.lang.String r3 = r0.getString(r3)
        L_0x0211:
            r7 = 1
            r6[r7] = r3
            java.lang.String r3 = r0.getString(r5, r6)
            r4.setText(r3)
            r3 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String[] r4 = r0.f249545e
            r5 = 0
            r4 = r4[r5]
            java.lang.String r5 = r0.f249552o
            java.lang.String r6 = r0.f249553p
            if (r6 == 0) goto L_0x0238
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0238
            r5 = r6
            goto L_0x036f
        L_0x0238:
            r6 = 2131835759(0x7f113b6f, float:1.9304666E38)
            java.lang.String r6 = r0.getString(r6)
            boolean r7 = r8.equals(r4)
            r8 = 0
            if (r7 != 0) goto L_0x024c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0275
        L_0x024c:
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r7 = "location"
            java.lang.String r2 = r2.mo165715mi(r7, r8)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x0266
            r2 = 2131823979(0x7f110d6b, float:1.9280773E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x0275
        L_0x0266:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = r7.toString()
        L_0x0275:
            boolean r2 = r10.equals(r4)
            if (r2 != 0) goto L_0x0281
            boolean r2 = r15.equals(r4)
            if (r2 == 0) goto L_0x02ab
        L_0x0281:
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r7 = "storage"
            java.lang.String r2 = r2.mo165715mi(r7, r8)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x029c
            r2 = 2131823986(0x7f110d72, float:1.9280787E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x02ab
        L_0x029c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = r7.toString()
        L_0x02ab:
            boolean r2 = r14.equals(r4)
            if (r2 == 0) goto L_0x02da
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r7 = "microphone"
            java.lang.String r2 = r2.mo165715mi(r7, r8)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x02cb
            r2 = 2131823980(0x7f110d6c, float:1.9280775E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x02da
        L_0x02cb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = r7.toString()
        L_0x02da:
            boolean r2 = r13.equals(r4)
            if (r2 == 0) goto L_0x0309
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r7 = "camera"
            java.lang.String r2 = r2.mo165715mi(r7, r8)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x02fa
            r2 = 2131823978(0x7f110d6a, float:1.928077E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x0309
        L_0x02fa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = r7.toString()
        L_0x0309:
            boolean r2 = r12.equals(r4)
            if (r2 == 0) goto L_0x0338
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r7 = "contact"
            java.lang.String r2 = r2.mo165715mi(r7, r8)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x0329
            r2 = 2131823981(0x7f110d6d, float:1.9280777E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x0338
        L_0x0329:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = r7.toString()
        L_0x0338:
            boolean r2 = r11.equals(r4)
            if (r2 == 0) goto L_0x0367
            di3.d r2 = di3.C86312j.m106911c(r1)
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r4 = "healthy"
            java.lang.String r2 = r2.mo165715mi(r4, r8)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0358
            r2 = 2131823983(0x7f110d6f, float:1.9280781E38)
            java.lang.String r9 = r0.getString(r2)
            goto L_0x0367
        L_0x0358:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            java.lang.String r9 = r4.toString()
        L_0x0367:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x036e
            goto L_0x036f
        L_0x036e:
            r5 = r9
        L_0x036f:
            r3.setText(r5)
            java.lang.String[] r2 = r0.f249545e
            int r3 = r2.length
            r4 = 0
        L_0x0376:
            if (r4 >= r3) goto L_0x03d5
            r5 = r2[r4]
            di3.d r6 = di3.C86312j.m106911c(r1)
            bh3.k r6 = (bh3.C113177k) r6
            r7 = 151(0x97, double:7.46E-322)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.mo165703Qv(r5, r7)
            int r4 = r4 + 1
            goto L_0x0376
        L_0x038c:
            if (r4 != r7) goto L_0x0399
            android.content.Intent r1 = r17.getIntent()
            android.content.Intent r1 = r1.getSelector()
            r0.f249550j = r1
            goto L_0x03d5
        L_0x0399:
            if (r4 != r5) goto L_0x03c2
            android.content.Intent r1 = r17.getIntent()
            android.content.Intent r1 = r1.getSelector()
            r0.f249550j = r1
            if (r1 == 0) goto L_0x03d5
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r2 = r0.f249549i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            android.content.Intent r2 = r0.f249550j
            java.lang.String r2 = r2.toString()
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "scene: %d, intent: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            goto L_0x03d5
        L_0x03c2:
            r3 = 1
            r1 = 4
            if (r4 != r1) goto L_0x03d5
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "scene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
        L_0x03d5:
            return
        L_0x03d6:
            r17.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.permission.PermissionActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.PermissionActivity", "onDestroy(), scene=%d", Integer.valueOf(this.f249549i));
        int i = this.f249549i;
        if (i == 1) {
            C88930e remove = C88929c.f256473a.remove(this.f249546f);
        } else if (i == 2) {
            C88931f remove2 = C88929c.f256474b.remove(this.f249546f);
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C34379c cVar;
        C88930e remove;
        boolean z = false;
        Log.m105925i("MicroMsg.PermissionActivity", "onRequestPermissionsResult(),  scene=%d, requestCode=%d, permissions=%s, grantResults=%s", Integer.valueOf(this.f249549i), Integer.valueOf(i), strArr.toString(), iArr.toString());
        Class cls = C113177k.class;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] != -1) {
                ((C113177k) C86312j.m106911c(cls)).mo165703Qv(str, 162L);
            } else if (C90111a.m112742f(this, str)) {
                ((C113177k) C86312j.m106911c(cls)).mo165703Qv(str, 163L);
            } else {
                ((C113177k) C86312j.m106911c(cls)).mo165703Qv(str, 164L);
            }
        }
        if (this.f249549i == 1 && (remove = C88929c.f256473a.remove(this.f249546f)) != null) {
            remove.onRequestPermissionsResult(i, strArr, iArr);
        }
        int i3 = 0;
        while (true) {
            if (i3 < strArr.length) {
                if (iArr[i3] != -1 || C90111a.m112742f(this, strArr[i3])) {
                    break;
                }
                i3++;
            } else {
                z = true;
                break;
            }
        }
        if (z && (cVar = this.f249554q) != null) {
            cVar.cancel(true);
        }
        finish();
    }

    public void onResume() {
        Log.m105925i("MicroMsg.PermissionActivity", "onResume(), scene=%d", Integer.valueOf(this.f249549i));
        super.onResume();
        if (this.f249548h) {
            int i = this.f249549i;
            if (i == 1) {
                String[] strArr = this.f249545e;
                int i2 = this.f249547g;
                HashMap<String, C88930e> hashMap = C88929c.f256473a;
                try {
                    for (String h : strArr) {
                        C88929c.m111024h(h, i2);
                    }
                    C90111a.m112741e(this, strArr, i2);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.MPermissionUtil", th, "requestPermissions err", new Object[0]);
                }
            } else if (i == 2) {
                if (!Util.isNullOrNil(this.f249552o) || !Util.isNullOrNil(this.f249551n)) {
                    C76879j.m92717K(this, false, this.f249552o, this.f249551n, MMApplicationContext.getContext().getString(C0966R.string.fyd), MMApplicationContext.getContext().getString(C0966R.string.f7926wf), new C85614b(), new C85615c());
                } else {
                    try {
                        startActivityForResult(this.f249550j, 1);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", Integer.valueOf(this.f249549i), e.getMessage());
                    }
                }
            } else if (i == 3) {
                if (Build.VERSION.SDK_INT < 26) {
                    Intent intent = this.f249550j;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (!getPackageManager().canRequestPackageInstalls()) {
                    try {
                        startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())), 1);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", Integer.valueOf(this.f249549i), e2.getMessage());
                    }
                } else {
                    Intent intent2 = this.f249550j;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (i == 4) {
                if (C28862c.m38400a().getBoolean("954_95_first", true)) {
                    C117407d.INSTANCE.idkeyStat(954, 95, 1, false);
                    C28862c.m38400a().edit().putBoolean("954_95_first", false);
                }
                C117407d.INSTANCE.idkeyStat(954, 96, 1, false);
                C76879j.m92717K(this, false, MMApplicationContext.getContext().getString(C0966R.string.hhx), MMApplicationContext.getContext().getString(C0966R.string.hif), MMApplicationContext.getContext().getString(C0966R.string.fyd), MMApplicationContext.getContext().getString(C0966R.string.f7926wf), new C85616d(), new C85617e());
            }
            this.f249548h = false;
            return;
        }
        this.f249548h = true;
    }
}
