package com.tencent.p014mm.plugin.voiceprint.p118ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C76879j;
import nj3.C76912y0;
import p162hk.C8537b;
import p192l4.C10462b;
import p447aw.C103918d;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI */
public final class VoicePrintStateSettingUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f21709f = 0;

    /* renamed from: d */
    public final C13601g f21710d = C36568h.m40985a(new C5702a(this));

    /* renamed from: e */
    public boolean f21711e;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$a */
    public static final class C5702a extends C87413o implements C32224a<C8537b> {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintStateSettingUI f21712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5702a(VoicePrintStateSettingUI voicePrintStateSettingUI) {
            super(0);
            this.f21712d = voicePrintStateSettingUI;
        }

        public Object invoke() {
            View findViewById = this.f21712d.getBodyView().findViewById(C0966R.C0970id.f359517lb1);
            int i = C0966R.C0970id.nsv;
            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.nsv);
            if (button != null) {
                i = C0966R.C0970id.nxj;
                MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) C10462b.m10395a(findViewById, C0966R.C0970id.nxj);
                if (mMSwitchBtn != null) {
                    i = C0966R.C0970id.nzx;
                    LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.nzx);
                    if (linearLayout != null) {
                        i = C0966R.C0970id.f359514o02;
                        ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f359514o02);
                        if (imageView != null) {
                            i = C0966R.C0970id.f359516o03;
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f359516o03);
                            if (linearLayout2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                                i = C0966R.C0970id.f359518o04;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f359518o04);
                                if (textView != null) {
                                    i = C0966R.C0970id.o05;
                                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.o05);
                                    if (linearLayout3 != null) {
                                        i = C0966R.C0970id.f359520lb3;
                                        TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f359520lb3);
                                        if (textView2 != null) {
                                            return new C8537b(constraintLayout, button, mMSwitchBtn, linearLayout, imageView, linearLayout2, constraintLayout, textView, linearLayout3, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$checkState$1", mo125469f = "VoicePrintStateSettingUI.kt", mo125470l = {148, 151, 163}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b */
    public static final class C5703b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f21713d;

        /* renamed from: e */
        public /* synthetic */ Object f21714e;

        /* renamed from: f */
        public final /* synthetic */ int f21715f;

        /* renamed from: g */
        public final /* synthetic */ VoicePrintStateSettingUI f21716g;

        /* renamed from: h */
        public final /* synthetic */ C89779i0 f21717h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$checkState$1$1", mo125469f = "VoicePrintStateSettingUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$a */
        public static final class C5704a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C89779i0 f21718d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5704a(C89779i0 i0Var, C15601d<? super C5704a> dVar) {
                super(2, dVar);
                this.f21718d = i0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C5704a(this.f21718d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C5704a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f21718d.dismiss();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$checkState$1$result$1$1", mo125469f = "VoicePrintStateSettingUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$b */
        public static final class C5705b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C89779i0 f21719d;

            /* renamed from: e */
            public final /* synthetic */ VoicePrintStateSettingUI f21720e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5705b(C89779i0 i0Var, VoicePrintStateSettingUI voicePrintStateSettingUI, C15601d<? super C5705b> dVar) {
                super(2, dVar);
                this.f21719d = i0Var;
                this.f21720e = voicePrintStateSettingUI;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C5705b(this.f21719d, this.f21720e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C5705b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f21719d.dismiss();
                VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21720e;
                int i = VoicePrintStateSettingUI.f21709f;
                voicePrintStateSettingUI.getClass();
                Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "showError");
                C76912y0.m92767f(voicePrintStateSettingUI.getContext(), voicePrintStateSettingUI.getContext().getString(C0966R.string.f361502n60));
                boolean z = (C75592q0.m90786p() & 131072) == 131072;
                Log.m105920e("MicroMsg.VoicePrintStateSettingUI", "check error, show local state " + z);
                VoicePrintStateSettingUI.m5508H7(this.f21720e, z);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5703b(int i, VoicePrintStateSettingUI voicePrintStateSettingUI, C89779i0 i0Var, C15601d<? super C5703b> dVar) {
            super(2, dVar);
            this.f21715f = i;
            this.f21716g = voicePrintStateSettingUI;
            this.f21717h = i0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C5703b bVar = new C5703b(this.f21715f, this.f21716g, this.f21717h, dVar);
            bVar.f21714e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C5703b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f21713d
                r2 = 3
                r3 = 2
                java.lang.String r4 = "MicroMsg.VoicePrintStateSettingUI"
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r6) goto L_0x0026
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r8.f21714e
                te3.be4 r0 = (te3.be4) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0084
            L_0x001a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x006a
            L_0x0026:
                java.lang.Object r1 = r8.f21714e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0049
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f21714e
                a14.n0 r9 = (a14.C0000n0) r9
                int r1 = r8.f21715f
                r8.f21714e = r9
                r8.f21713d = r6
                a14.h0 r9 = a14.C53872d1.f151119c
                k33.a r7 = new k33.a
                r7.<init>(r1, r5)
                java.lang.Object r9 = a14.C53895h.m60469g(r9, r7, r8)
                if (r9 != r0) goto L_0x0049
                return r0
            L_0x0049:
                te3.be4 r9 = (te3.be4) r9
                if (r9 != 0) goto L_0x006d
                qo3.i0 r9 = r8.f21717h
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI r1 = r8.f21716g
                java.lang.String r2 = "checkState: check error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r2 = f14.C58901s.f168555a
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$b r4 = new com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$b
                r4.<init>(r9, r1, r5)
                r8.f21714e = r5
                r8.f21713d = r3
                java.lang.Object r9 = a14.C53895h.m60469g(r2, r4, r8)
                if (r9 != r0) goto L_0x006a
                return r0
            L_0x006a:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            L_0x006d:
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$a r3 = new com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$b$a
                qo3.i0 r7 = r8.f21717h
                r3.<init>(r7, r5)
                r8.f21714e = r9
                r8.f21713d = r2
                java.lang.Object r1 = a14.C53895h.m60469g(r1, r3, r8)
                if (r1 != r0) goto L_0x0083
                return r0
            L_0x0083:
                r0 = r9
            L_0x0084:
                int r9 = r0.f131072e
                r1 = 0
                if (r9 != r6) goto L_0x00ed
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI r9 = r8.f21716g
                r9.f21711e = r1
                java.lang.String r9 = "checkState: exists"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r9)
                int r9 = r0.f131071d
                if (r9 <= 0) goto L_0x0097
                goto L_0x0098
            L_0x0097:
                r6 = 0
            L_0x0098:
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI r9 = r8.f21716g
                com.tencent.p014mm.plugin.voiceprint.p118ui.VoicePrintStateSettingUI.m5508H7(r9, r6)
                int r9 = eb0.C75592q0.m90786p()
                if (r6 == 0) goto L_0x00a7
                r0 = 131072(0x20000, float:1.83671E-40)
                r0 = r0 | r9
                goto L_0x00ab
            L_0x00a7:
                r0 = -131073(0xfffffffffffdffff, float:NaN)
                r0 = r0 & r9
            L_0x00ab:
                eb0.i3 r1 = eb0.C7624i3.f25910c
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r3 = "last_login_use_voice"
                r1.mo8756d(r3, r2)
                eb0.c r1 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r1 = r1.mo105906u()
                r2 = 40
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r0)
                r1.mo119676J(r2, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "checkState: old value "
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = " new value "
                r1.append(r9)
                r1.append(r0)
                java.lang.String r9 = " svrSwitch "
                r1.append(r9)
                r1.append(r6)
                java.lang.String r9 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
                goto L_0x0121
            L_0x00ed:
                java.lang.String r9 = "checkState: not exists"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r9)
                com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI r9 = r8.f21716g
                int r0 = com.tencent.p014mm.plugin.voiceprint.p118ui.VoicePrintStateSettingUI.f21709f
                hk.b r0 = r9.mo6734K7()
                android.widget.Button r0 = r0.f27596a
                r0.setVisibility(r1)
                hk.b r0 = r9.mo6734K7()
                android.widget.TextView r0 = r0.f27600e
                r0.setVisibility(r1)
                hk.b r0 = r9.mo6734K7()
                android.widget.LinearLayout r0 = r0.f27601f
                r1 = 8
                r0.setVisibility(r1)
                hk.b r0 = r9.mo6734K7()
                android.widget.Button r0 = r0.f27596a
                com.tencent.mm.plugin.voiceprint.ui.l r1 = new com.tencent.mm.plugin.voiceprint.ui.l
                r1.<init>(r9)
                r0.setOnClickListener(r1)
            L_0x0121:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voiceprint.p118ui.VoicePrintStateSettingUI.C5703b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$c */
    public static final class C5706c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C5706c f21721d = new C5706c();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$d */
    public static final class C5707d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintStateSettingUI f21722d;

        public C5707d(VoicePrintStateSettingUI voicePrintStateSettingUI) {
            this.f21722d = voicePrintStateSettingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21722d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$e */
    public static final class C5708e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintStateSettingUI f21723d;

        public C5708e(VoicePrintStateSettingUI voicePrintStateSettingUI) {
            this.f21723d = voicePrintStateSettingUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f21723d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI$f */
    public static final class C5709f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C5709f f21724d = new C5709f();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: H7 */
    public static final void m5508H7(VoicePrintStateSettingUI voicePrintStateSettingUI, boolean z) {
        voicePrintStateSettingUI.getClass();
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView() called with: enable = " + z);
        voicePrintStateSettingUI.mo6734K7().f27596a.setVisibility(8);
        voicePrintStateSettingUI.mo6734K7().f27600e.setVisibility(8);
        voicePrintStateSettingUI.mo6734K7().f27601f.setVisibility(0);
        voicePrintStateSettingUI.mo6734K7().f27597b.setCheck(z);
        voicePrintStateSettingUI.mo6734K7().f27597b.setSwitchListener(new C5721m(voicePrintStateSettingUI));
        voicePrintStateSettingUI.mo6734K7().f27599d.setOnClickListener(new C5722n(voicePrintStateSettingUI));
        voicePrintStateSettingUI.mo6734K7().f27598c.setOnClickListener(new C5723o(voicePrintStateSettingUI));
    }

    /* renamed from: I7 */
    public final void mo6732I7(int i) {
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "checkState() called with: opCode = " + i);
        C89779i0 Q = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f361503n61), true, false, C5706c.f21721d);
        Q.show();
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C5703b(i, this, Q, (C15601d<? super C5703b>) null), 3, (Object) null);
    }

    /* renamed from: J7 */
    public final void mo6733J7() {
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "createLock() called");
        Intent intent = new Intent();
        intent.setClass(this, VoiceCreateUI.class);
        intent.putExtra("kscene_type", 71);
        intent.putExtra("trans_out_anim", C0966R.C0968anim.f2469dt);
        intent.putExtra("createVoicePrint", true);
        startActivityForResult(intent, 1);
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    /* renamed from: K7 */
    public final C8537b mo6734K7() {
        return (C8537b) ((C36570n) this.f21710d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5v;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "onActivityResult() called with: requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent);
        boolean z = false;
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                z = intent.getBooleanExtra("KIsCreateSuccess", false);
            }
            if (z) {
                mo6732I7(1);
            } else {
                this.f21711e = true;
            }
        } else if (i == 2 && i2 == -1) {
            if (intent != null ? intent.getBooleanExtra("KIsCreateSuccess", false) : false) {
                mo6732I7(0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        u.mo119677K(aVar, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_VOICEPRINT_SETTING_DOT_SHOW_BOOLEAN, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, bool);
        setBackBtn(new C5707d(this));
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        C85875k4.m106191k0(mo6734K7().f27602g.getPaint());
        mo6732I7(0);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (iArr.length == 0) {
            Log.m105925i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 80) {
            return;
        }
        if (iArr[0] == 0) {
            mo6733J7();
        } else {
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C5708e(this), C5709f.f21724d);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f21711e) {
            mo6732I7(0);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C5711e.class);
    }
}
