package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39691c;
import b03.C39718p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.IXWebBroadcastListener;
import cz2.C45241s;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C59741c0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77459z;
import qz2.C47914d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import uz2.C52718u;
import vz2.C78501d;
import yz2.C79256p0;
import yz2.C79271t0;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/ui/widget/a$d;", "Landroid/view/View;", "e", "Landroid/view/View;", "getLayoutContent", "()Landroid/view/View;", "setLayoutContent", "(Landroid/view/View;)V", "layoutContent", "<init>", "()V", "a", "b", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity */
public final class TextStatusDoWhatActivity extends MMSecDataActivity implements C74965a.C74969d {

    /* renamed from: C */
    public static final C5638a f206763C = new C5638a((C8480h) null);

    /* renamed from: A */
    public View f206764A;

    /* renamed from: B */
    public TextView f206765B;

    /* renamed from: d */
    public WxRecyclerView f206766d;

    /* renamed from: e */
    public View f206767e;

    /* renamed from: f */
    public boolean f206768f;

    /* renamed from: g */
    public String f206769g = "";

    /* renamed from: h */
    public C47914d f206770h;

    /* renamed from: i */
    public C77459z f206771i;

    /* renamed from: j */
    public boolean f206772j = true;

    /* renamed from: n */
    public final C13601g f206773n = C36568h.m40985a(new C71368c(this));

    /* renamed from: o */
    public final C13601g f206774o = C36568h.m40985a(new C71369d(this));

    /* renamed from: p */
    public final TextStatusDoWhatActivity$configUpdateListener$1 f206775p;

    /* renamed from: q */
    public final TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1 f206776q;

    /* renamed from: r */
    public final ArrayList<C9493c> f206777r;

    /* renamed from: s */
    public HashMap<String, String> f206778s;

    /* renamed from: t */
    public boolean f206779t;

    /* renamed from: u */
    public final C71370h f206780u;

    /* renamed from: v */
    public final int f206781v;

    /* renamed from: w */
    public View f206782w;

    /* renamed from: x */
    public EditText f206783x;

    /* renamed from: y */
    public WeImageView f206784y;

    /* renamed from: z */
    public C71367b f206785z;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$a */
    public static final class C5638a {
        public C5638a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo6661a(Context context, Bundle bundle, Integer num) {
            C87412m.m108594g(context, "context");
            Intent intent = new Intent(context, TextStatusDoWhatActivity.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("KEY_IS_ENTER", true);
            intent.putExtras(bundle);
            if (num == null || !(context instanceof Activity)) {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                int intValue = num.intValue();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(intValue));
                aVar2.mo10233c(intent);
                C117292a.m165364j((Activity) context, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            }
        }

        /* renamed from: b */
        public final void mo6662b(Activity activity, int i, String str) {
            C87412m.m108594g(activity, "context");
            Intent intent = new Intent(activity, TextStatusDoWhatActivity.class);
            intent.putExtra("KEY_DEFAULT_BACKGROUND_ID", i);
            intent.putExtra("KEY_CUSTOM_TITLE", str);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(3);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$Companion", "startForResultInEdit", "(Landroid/app/Activity;ILjava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$e */
    public static final class C5639e extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ TextStatusDoWhatActivity f21587b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<GridLayoutManager> f21588c;

        public C5639e(TextStatusDoWhatActivity textStatusDoWhatActivity, C8479f0<GridLayoutManager> f0Var) {
            this.f21587b = textStatusDoWhatActivity;
            this.f21588c = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.getAdapter();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo118c(int r4) {
            /*
                r3 = this;
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity r0 = r3.f21587b
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.f206766d
                if (r0 == 0) goto L_0x0015
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0015
                int r4 = r0.getItemViewType(r4)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                r0 = -1
                r1 = 1
                if (r4 != 0) goto L_0x001b
                goto L_0x002a
            L_0x001b:
                int r2 = r4.intValue()
                if (r2 != r0) goto L_0x002a
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r4 = r3.f21588c
                T r4 = r4.f27484d
                androidx.recyclerview.widget.GridLayoutManager r4 = (androidx.recyclerview.widget.GridLayoutManager) r4
                int r1 = r4.f44669w
                goto L_0x003b
            L_0x002a:
                if (r4 != 0) goto L_0x002d
                goto L_0x003b
            L_0x002d:
                int r4 = r4.intValue()
                if (r4 != r1) goto L_0x003b
                gy3.f0<androidx.recyclerview.widget.GridLayoutManager> r4 = r3.f21588c
                T r4 = r4.f27484d
                androidx.recyclerview.widget.GridLayoutManager r4 = (androidx.recyclerview.widget.GridLayoutManager) r4
                int r1 = r4.f44669w
            L_0x003b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity.C5639e.mo118c(int):int");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$f */
    public static final class C5640f extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f21589d;

        public C5640f(C59741c0 c0Var) {
            this.f21589d = c0Var;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            float f = this.f21589d.f170634d;
            rect.bottom = (int) f;
            rect.left = ((int) f) / 2;
            rect.right = ((int) f) / 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$g */
    public static final class C5641g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivity f21590d;

        public C5641g(TextStatusDoWhatActivity textStatusDoWhatActivity) {
            this.f21590d = textStatusDoWhatActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f21590d.onBackPressed();
            this.f21590d.getContext().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$b */
    public final class C71367b implements TextWatcher {
        public C71367b() {
        }

        public void afterTextChanged(Editable editable) {
            Editable editable2 = editable;
            TextStatusDoWhatActivity textStatusDoWhatActivity = TextStatusDoWhatActivity.this;
            EditText editText = textStatusDoWhatActivity.f206783x;
            if (editText != null) {
                editText.removeTextChangedListener(textStatusDoWhatActivity.f206785z);
            }
            String valueOf = String.valueOf(editable);
            int e = C45078p0.m49926e(valueOf, C45078p0.C45079a.MODE_CHINESE_AS_2);
            TextStatusDoWhatActivity.this.mo98414I7();
            Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "afterTextChanged inputCount:" + e);
            String valueOf2 = String.valueOf(editable);
            TextStatusDoWhatActivity textStatusDoWhatActivity2 = TextStatusDoWhatActivity.this;
            int i = textStatusDoWhatActivity2.f206781v;
            boolean z = false;
            if (e > i) {
                String h = C45078p0.m49929h(valueOf2, i);
                if (editable2 != null) {
                    editable2.replace(h.length(), valueOf2.length(), "");
                }
                TextView textView = TextStatusDoWhatActivity.this.f206765B;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                C77459z zVar = TextStatusDoWhatActivity.this.f206771i;
                if (zVar != null) {
                    zVar.f229409q++;
                }
            } else {
                TextView textView2 = textStatusDoWhatActivity2.f206765B;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
                TextStatusDoWhatActivity textStatusDoWhatActivity3 = TextStatusDoWhatActivity.this;
                HashMap<String, String> hashMap = textStatusDoWhatActivity3.f206778s;
                if (hashMap != null) {
                    if (hashMap.containsKey(valueOf)) {
                        String str = hashMap.get(valueOf);
                        C39691c.m42340S(IStatusIconHelperKt.m39109a(), textStatusDoWhatActivity3.f206784y, str, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
                        textStatusDoWhatActivity3.f206770h = new C47914d(valueOf, str);
                    } else {
                        C39691c.m42340S(IStatusIconHelperKt.m39109a(), textStatusDoWhatActivity3.f206784y, "userdefine", (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
                        textStatusDoWhatActivity3.f206770h = new C47914d(valueOf, "userdefine");
                    }
                }
            }
            TextStatusDoWhatActivity textStatusDoWhatActivity4 = TextStatusDoWhatActivity.this;
            EditText editText2 = textStatusDoWhatActivity4.f206783x;
            if (editText2 != null) {
                editText2.addTextChangedListener(textStatusDoWhatActivity4.f206785z);
            }
            View view = TextStatusDoWhatActivity.this.f206782w;
            Button button = view != null ? (Button) view.findViewById(C0966R.C0970id.f357756bl2) : null;
            if (button != null) {
                if (editable2 != null && editable.length() == 0) {
                    z = true;
                }
                button.setEnabled(!z);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$c */
    public static final class C71368c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivity f206787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71368c(TextStatusDoWhatActivity textStatusDoWhatActivity) {
            super(0);
            this.f206787d = textStatusDoWhatActivity;
        }

        public Object invoke() {
            return this.f206787d.findViewById(C0966R.C0970id.al_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$d */
    public static final class C71369d extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivity f206788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71369d(TextStatusDoWhatActivity textStatusDoWhatActivity) {
            super(0);
            this.f206788d = textStatusDoWhatActivity;
        }

        public Object invoke() {
            return (ResultReceiver) this.f206788d.getIntent().getParcelableExtra("CALLBACK");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$h */
    public static final class C71370h implements C45241s {

        /* renamed from: a */
        public final /* synthetic */ TextStatusDoWhatActivity f206789a;

        public C71370h(TextStatusDoWhatActivity textStatusDoWhatActivity) {
            this.f206789a = textStatusDoWhatActivity;
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
            r7 = r7.f229399d;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo70748a(android.view.View r25, java.lang.String r26) {
            /*
                r24 = this;
                r0 = r24
                r1 = r26
                java.lang.String r2 = "v"
                r3 = r25
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "iconId"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.String r2 = "userdefine"
                boolean r2 = gy3.C87412m.m108589b(r1, r2)
                if (r2 == 0) goto L_0x01c7
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity r2 = r0.f206789a
                qy2.z r3 = r2.f206771i
                r4 = 1
                if (r3 == 0) goto L_0x0026
                int r5 = r3.f229408p
                int r5 = r5 + r4
                r3.f229408p = r5
            L_0x0026:
                r3 = 2131300667(0x7f09113b, float:1.821937E38)
                android.view.View r3 = r2.findViewById(r3)
                r2.f206782w = r3
                r3 = 2131316054(0x7f094d56, float:1.8250579E38)
                android.view.View r3 = r2.findViewById(r3)
                r2.f206764A = r3
                android.view.View r3 = r2.f206782w
                r5 = 0
                if (r3 == 0) goto L_0x0052
                b03.p r6 = b03.C39718p.f106569a
                qy2.z r7 = r2.f206771i
                if (r7 == 0) goto L_0x004a
                uz2.u r7 = r7.f229399d
                if (r7 == 0) goto L_0x004a
                java.lang.String r7 = r7.f147252x
                goto L_0x004b
            L_0x004a:
                r7 = r5
            L_0x004b:
                int r6 = r6.mo62351b(r7)
                r3.setBackgroundResource(r6)
            L_0x0052:
                android.view.View r3 = r2.f206782w
                androidx.appcompat.app.AppCompatActivity r6 = r2.getContext()
                r7 = 2131165324(0x7f07008c, float:1.7944862E38)
                int r6 = kg3.C76577a.m92155f(r6, r7)
                float r6 = (float) r6
                if (r3 != 0) goto L_0x0063
                goto L_0x006b
            L_0x0063:
                b03.c0 r7 = new b03.c0
                r7.<init>(r4, r4, r6)
                r3.setOutlineProvider(r7)
            L_0x006b:
                if (r3 != 0) goto L_0x006e
                goto L_0x0071
            L_0x006e:
                r3.setClipToOutline(r4)
            L_0x0071:
                android.view.View r3 = r2.f206782w
                if (r3 == 0) goto L_0x007f
                r6 = 2131300665(0x7f091139, float:1.8219366E38)
                android.view.View r3 = r3.findViewById(r6)
                android.widget.EditText r3 = (android.widget.EditText) r3
                goto L_0x0080
            L_0x007f:
                r3 = r5
            L_0x0080:
                r2.f206783x = r3
                android.view.View r3 = r2.f206782w
                if (r3 == 0) goto L_0x0090
                r6 = 2131300666(0x7f09113a, float:1.8219368E38)
                android.view.View r3 = r3.findViewById(r6)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
                goto L_0x0091
            L_0x0090:
                r3 = r5
            L_0x0091:
                r2.f206784y = r3
                b03.c r6 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                com.tencent.mm.ui.widget.imageview.WeImageView r7 = r2.f206784y
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 124(0x7c, float:1.74E-43)
                r15 = 0
                java.lang.String r8 = "userdefine"
                b03.C39691c.m42340S(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                android.view.View r3 = r2.f206782w
                r6 = 0
                if (r3 != 0) goto L_0x00ad
                goto L_0x00ec
            L_0x00ad:
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r8)
                java.lang.Object[] r17 = r7.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity"
                java.lang.String r19 = "showCustomDialog"
                java.lang.String r20 = "(Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r3
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r17 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity"
                java.lang.String r18 = "showCustomDialog"
                java.lang.String r19 = "(Ljava/lang/String;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x00ec:
                android.view.View r3 = r2.f206764A
                if (r3 != 0) goto L_0x00f1
                goto L_0x0130
            L_0x00f1:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r15.mo10233c(r7)
                java.lang.Object[] r8 = r15.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity"
                java.lang.String r10 = "showCustomDialog"
                java.lang.String r11 = "(Ljava/lang/String;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r3
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r7 = r15.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r8 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity"
                java.lang.String r9 = "showCustomDialog"
                java.lang.String r10 = "(Ljava/lang/String;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r7 = r3
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x0130:
                android.view.View r3 = r2.f206764A
                if (r3 == 0) goto L_0x0139
                yz2.q0 r7 = yz2.C16087q0.f43234d
                r3.setOnClickListener(r7)
            L_0x0139:
                java.lang.String r3 = r2.f206769g
                int r7 = r3.length()
                if (r7 <= 0) goto L_0x0142
                goto L_0x0143
            L_0x0142:
                r4 = 0
            L_0x0143:
                if (r4 == 0) goto L_0x0157
                android.widget.EditText r4 = r2.f206783x
                if (r4 == 0) goto L_0x014c
                r4.setText(r3)
            L_0x014c:
                android.widget.EditText r4 = r2.f206783x
                if (r4 == 0) goto L_0x0157
                int r3 = r3.length()
                r4.setSelection(r3)
            L_0x0157:
                r2.mo98414I7()
                android.widget.EditText r3 = r2.f206783x
                if (r3 == 0) goto L_0x0163
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$b r4 = r2.f206785z
                r3.removeTextChangedListener(r4)
            L_0x0163:
                android.widget.EditText r3 = r2.f206783x
                if (r3 == 0) goto L_0x016c
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$b r4 = r2.f206785z
                r3.addTextChangedListener(r4)
            L_0x016c:
                android.view.View r3 = r2.f206782w
                if (r3 == 0) goto L_0x017e
                r4 = 2131300653(0x7f09112d, float:1.8219342E38)
                android.view.View r3 = r3.findViewById(r4)
                com.tencent.mm.ui.widget.InputPanelLinearLayout r3 = (com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout) r3
                if (r3 == 0) goto L_0x017e
                r3.mo104200a(r2)
            L_0x017e:
                android.view.View r3 = r2.f206782w
                if (r3 == 0) goto L_0x0195
                r4 = 2131306719(0x7f0928df, float:1.8231645E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                if (r3 == 0) goto L_0x0195
                yz2.r0 r4 = new yz2.r0
                r4.<init>(r2)
                r3.setOnClickListener(r4)
            L_0x0195:
                android.view.View r3 = r2.f206782w
                if (r3 == 0) goto L_0x01ac
                r4 = 2131298457(0x7f090899, float:1.8214888E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.Button r3 = (android.widget.Button) r3
                if (r3 == 0) goto L_0x01ac
                yz2.s0 r4 = new yz2.s0
                r4.<init>(r2, r1)
                r3.setOnClickListener(r4)
            L_0x01ac:
                android.view.View r1 = r2.f206782w
                if (r1 == 0) goto L_0x01ba
                r3 = 2131315852(0x7f094c8c, float:1.8250169E38)
                android.view.View r1 = r1.findViewById(r3)
                r5 = r1
                android.widget.TextView r5 = (android.widget.TextView) r5
            L_0x01ba:
                r2.f206765B = r5
                android.widget.EditText r1 = r2.f206783x
                if (r1 == 0) goto L_0x01c3
                r1.requestFocus()
            L_0x01c3:
                r2.showVKB()
                goto L_0x01cc
            L_0x01c7:
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity r2 = r0.f206789a
                com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity.m83891H7(r2, r1)
            L_0x01cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity.C71370h.mo70748a(android.view.View, java.lang.String):void");
        }
    }

    public TextStatusDoWhatActivity() {
        C40008f fVar = C40008f.f107254d;
        this.f206775p = new TextStatusDoWhatActivity$configUpdateListener$1(this, fVar);
        this.f206776q = new TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1(this, fVar);
        this.f206777r = new ArrayList<>();
        this.f206780u = new C71370h(this);
        this.f206781v = 10;
        this.f206785z = new C71367b();
    }

    /* renamed from: H7 */
    public static final void m83891H7(TextStatusDoWhatActivity textStatusDoWhatActivity, String str) {
        if (textStatusDoWhatActivity.f206768f) {
            C77459z zVar = textStatusDoWhatActivity.f206771i;
            if (zVar != null) {
                zVar.f229399d.f147238g.f147088e = str;
            } else {
                zVar = new C77459z();
                zVar.f229399d.f147238g.f147088e = str;
                zVar.f229405j = 0;
                zVar.f229403h = "";
                zVar.f229404i = 0;
                zVar.f229406n = 0;
                zVar.f229407o = 0;
            }
            C77459z zVar2 = zVar;
            if (C87412m.m108589b(str, "userdefine")) {
                zVar2.f229399d.f147238g.f147092i = textStatusDoWhatActivity.f206769g;
            }
            TextStatusEditActivity.C71390b.m83965c(TextStatusEditActivity.f206867L1, textStatusDoWhatActivity, zVar2, true, textStatusDoWhatActivity.f206779t, (ResultReceiver) textStatusDoWhatActivity.getIntent().getParcelableExtra("CALLBACK"), false, 32, (Object) null);
            C119179t tVar = C119157j.f356862d;
            C79256p0 p0Var = new C79256p0(textStatusDoWhatActivity);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(p0Var, 50, false);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("STATUS_TYPE_CUSTOM_TITLE", textStatusDoWhatActivity.f206769g);
        intent.putExtra("STATUS_TYPE_IMG", str);
        C77459z zVar3 = textStatusDoWhatActivity.f206771i;
        intent.putExtra("ClkCustomIconCount", zVar3 != null ? zVar3.f229408p : 0);
        C77459z zVar4 = textStatusDoWhatActivity.f206771i;
        intent.putExtra("CustomTitleTooLongCount", zVar4 != null ? zVar4.f229409q : 0);
        intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", textStatusDoWhatActivity.f206779t);
        textStatusDoWhatActivity.setResult(-1, intent);
        textStatusDoWhatActivity.f206772j = false;
        textStatusDoWhatActivity.finish();
        textStatusDoWhatActivity.getContext().overridePendingTransition(0, C0966R.C0968anim.f2469dt);
    }

    /* renamed from: I7 */
    public final void mo98414I7() {
        Editable text;
        CharSequence i0;
        View view = this.f206782w;
        Button button = view != null ? (Button) view.findViewById(C0966R.C0970id.f357588am1) : null;
        if (button != null) {
            EditText editText = this.f206783x;
            boolean z = false;
            if (((editText == null || (text = editText.getText()) == null || (i0 = C112550d0.m153799i0(text)) == null) ? 0 : i0.length()) > 0) {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: J7 */
    public final View mo98415J7() {
        Object value = ((C36570n) this.f206773n).getValue();
        C87412m.m108593f(value, "<get-btnBack>(...)");
        return (View) value;
    }

    /* renamed from: K7 */
    public final void mo98416K7() {
        View view = this.f206782w;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f206764A;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        EditText editText = this.f206783x;
        if (editText != null) {
            editText.setText("");
        }
        hideVKB();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r1 = (qz2.C47914d) r1;
     */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.String> mo98417L7(java.util.ArrayList<jq3.C9493c> r4) {
        /*
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0011:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r4.next()
            jq3.c r1 = (jq3.C9493c) r1
            boolean r2 = r1 instanceof qz2.C47914d
            if (r2 == 0) goto L_0x0011
            qz2.d r1 = (qz2.C47914d) r1
            java.lang.String r2 = r1.f128569d
            if (r2 == 0) goto L_0x0011
            java.lang.String r1 = r1.f128570e
            if (r1 == 0) goto L_0x0011
            r0.put(r2, r1)
            goto L_0x0011
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity.mo98417L7(java.util.ArrayList):java.util.HashMap");
    }

    public void finish() {
        if (this.f206772j) {
            if (this.f206768f) {
                C78501d.f229945a.mo108458d(this.f206771i, 3);
                ResultReceiver resultReceiver = (ResultReceiver) ((C36570n) this.f206774o).getValue();
                if (resultReceiver != null) {
                    resultReceiver.send(0, (Bundle) null);
                }
            }
            Intent intent = new Intent();
            C77459z zVar = this.f206771i;
            intent.putExtra("ClkCustomIconCount", zVar != null ? zVar.f229408p : 0);
            C77459z zVar2 = this.f206771i;
            intent.putExtra("CustomTitleTooLongCount", zVar2 != null ? zVar2.f229409q : 0);
            setResult(0, intent);
        }
        super.finish();
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.ixf;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360034c93;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (z) {
            View view = this.f206782w;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                View view2 = this.f206782w;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            return;
        }
        View view3 = this.f206782w;
        ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            View view4 = this.f206782w;
            if (view4 != null) {
                view4.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        View view = this.f206782w;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            mo98416K7();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        String str = "";
        setMMTitle(str);
        hideActionbarLine();
        hideActionBarOperationArea();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        this.f206766d = (WxRecyclerView) findViewById(C0966R.C0970id.ixf);
        this.f206767e = findViewById(C0966R.C0970id.fkg);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SET_TEXT_PARAMS");
        if (byteArrayExtra != null) {
            C77459z zVar = new C77459z();
            zVar.parseFrom(byteArrayExtra);
            this.f206771i = zVar;
        }
        if (this.f206771i == null) {
            this.f206771i = new C77459z();
        }
        C77459z zVar2 = this.f206771i;
        if (zVar2 == null) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("KEY_CUSTOM_TITLE");
        if (stringExtra != null) {
            str = stringExtra;
        }
        this.f206769g = str;
        zVar2.f229405j = C31543z5.m39453c();
        C52718u uVar = zVar2.f229399d;
        C39718p pVar = C39718p.f106569a;
        uVar.f147252x = pVar.mo62350a(getIntent().getIntExtra("KEY_DEFAULT_BACKGROUND_ID", pVar.mo62352c()));
        this.f206768f = getIntent().getBooleanExtra("KEY_IS_ENTER", false);
        Bitmap bitmapNative = BitmapUtil.getBitmapNative(pVar.mo62351b(zVar2.f229399d.f147252x));
        View view = this.f206767e;
        if (view != null) {
            view.setBackground(new BitmapDrawable(getResources(), bitmapNative));
        }
        this.f206777r.addAll(IStatusIconHelperKt.m39109a().mo62295g());
        WxRecyclerView wxRecyclerView = this.f206766d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(new WxRecyclerAdapter(new TextStatusDoWhatActivity$buildItemConverts$1(this), this.f206777r, false));
        }
        this.f206778s = mo98417L7(this.f206777r);
        int min = Math.min(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());
        WxRecyclerView wxRecyclerView2 = this.f206766d;
        int paddingLeft = min - (wxRecyclerView2 != null ? wxRecyclerView2.getPaddingLeft() : 0);
        WxRecyclerView wxRecyclerView3 = this.f206766d;
        int paddingRight = paddingLeft - (wxRecyclerView3 != null ? wxRecyclerView3.getPaddingRight() : 0);
        float dimension = getResources().getDimension(C0966R.dimen.apb);
        C59741c0 c0Var = new C59741c0();
        float dimension2 = getResources().getDimension(C0966R.dimen.apa);
        c0Var.f170634d = dimension2;
        float f = (((float) paddingRight) + dimension2) / (dimension + dimension2);
        C8479f0 f0Var = new C8479f0();
        T gridLayoutManager = new GridLayoutManager(this, (int) f);
        f0Var.f27484d = gridLayoutManager;
        gridLayoutManager.f44666B = new C5639e(this, f0Var);
        WxRecyclerView wxRecyclerView4 = this.f206766d;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.setLayoutManager((RecyclerView.LayoutManager) f0Var.f27484d);
        }
        WxRecyclerView wxRecyclerView5 = this.f206766d;
        if (wxRecyclerView5 != null) {
            wxRecyclerView5.mo17085h0(new C5640f(c0Var));
        }
        ViewGroup.LayoutParams layoutParams = mo98415J7().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).topMargin = C75044y4.m89994f(getContext()) + C74942w4.m89784a(getContext(), 6);
        mo98415J7().setOnClickListener(new C5641g(this));
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TEXT_STATUS_EDUCATION_FLAG_INT;
        boolean z = i.mo119689j(aVar, 1) == 1;
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, false);
        if (z && !g) {
            C77459z zVar3 = this.f206771i;
            if (zVar3 != null) {
                zVar3.f229406n = 1;
            }
            View findViewById = findViewById(C0966R.C0970id.cdh);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            WxRecyclerView wxRecyclerView6 = this.f206766d;
            if (wxRecyclerView6 != null) {
                wxRecyclerView6.setVisibility(8);
            }
            View J7 = mo98415J7();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view3 = J7;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            J7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showEducationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C77448f0.m93396h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            findViewById(C0966R.C0970id.cdg).setOnClickListener(new C79271t0(this));
        }
        this.f206775p.alive();
        this.f206776q.alive();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.TextStatusDoWhatActivity).mo86179qs(this, C76986a.TextState);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f206779t && this.f206772j) {
            IStatusIconHelperKt.m39109a().mo62308t();
        }
        this.f206775p.dead();
        this.f206776q.dead();
    }

    public void onPause() {
        super.onPause();
    }

    public final void setLayoutContent(View view) {
        this.f206767e = view;
    }
}
