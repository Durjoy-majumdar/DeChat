package op1;

import ak1.C54108o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: op1.g */
public final class C11710g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Context f34277d;

    /* renamed from: e */
    public final /* synthetic */ String f34278e;

    /* renamed from: f */
    public final /* synthetic */ String f34279f;

    /* renamed from: g */
    public final /* synthetic */ C62080b f34280g;

    /* renamed from: h */
    public final /* synthetic */ long f34281h;

    /* renamed from: op1.g$a */
    public static final class C11711a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditText f34282d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f34283e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11711a(EditText editText, ImageView imageView) {
            super(0);
            this.f34282d = editText;
            this.f34283e = imageView;
        }

        public Object invoke() {
            if (this.f34282d.getText().toString().length() > 0) {
                this.f34283e.setVisibility(0);
            } else {
                this.f34283e.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: op1.g$b */
    public static final class C11712b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f34284d;

        public C11712b(EditText editText) {
            this.f34284d = editText;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$showRecommendBottomSheet$1$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f34284d.setText("");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$showRecommendBottomSheet$1$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: op1.g$c */
    public static final class C11713c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f34285d;

        /* renamed from: e */
        public final /* synthetic */ String f34286e;

        /* renamed from: f */
        public final /* synthetic */ C62080b f34287f;

        public C11713c(EditText editText, String str, C62080b bVar) {
            this.f34285d = editText;
            this.f34286e = str;
            this.f34287f = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            r0 = r1.getContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                android.widget.EditText r0 = r3.f34285d     // Catch:{ Exception -> 0x0030 }
                java.lang.String r1 = r3.f34286e     // Catch:{ Exception -> 0x0030 }
                int r1 = r1.length()     // Catch:{ Exception -> 0x0030 }
                r0.setSelection(r1)     // Catch:{ Exception -> 0x0030 }
                op1.b r0 = r3.f34287f     // Catch:{ Exception -> 0x0030 }
                android.widget.EditText r1 = r3.f34285d     // Catch:{ Exception -> 0x0030 }
                r0.getClass()     // Catch:{ Exception -> 0x0030 }
                if (r1 == 0) goto L_0x0017
                r1.requestFocus()     // Catch:{ Exception -> 0x0030 }
            L_0x0017:
                if (r1 == 0) goto L_0x0026
                android.content.Context r0 = r1.getContext()     // Catch:{ Exception -> 0x0030 }
                if (r0 == 0) goto L_0x0026
                java.lang.String r2 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0030 }
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ Exception -> 0x0030 }
                if (r0 == 0) goto L_0x0038
                r2 = 0
                r0.showSoftInput(r1, r2)     // Catch:{ Exception -> 0x0030 }
                goto L_0x0038
            L_0x0030:
                r0 = move-exception
                er1.j4 r1 = er1.C58739j4.f168176a
                java.lang.String r2 = "FinderLiveShoppingEditAdapter"
                r1.mo83712h0(r0, r2)
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: op1.C11710g.C11713c.run():void");
        }
    }

    /* renamed from: op1.g$d */
    public static final class C11714d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Context f34288a;

        /* renamed from: b */
        public final /* synthetic */ C62080b f34289b;

        /* renamed from: c */
        public final /* synthetic */ long f34290c;

        /* renamed from: d */
        public final /* synthetic */ EditText f34291d;

        /* renamed from: e */
        public final /* synthetic */ String f34292e;

        public C11714d(Context context, C62080b bVar, long j, EditText editText, String str) {
            this.f34288a = context;
            this.f34289b = bVar;
            this.f34290c = j;
            this.f34291d = editText;
            this.f34292e = str;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Class cls = C54108o.class;
            Context context = this.f34288a;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            if (z) {
                JSONObject jSONObject = new JSONObject();
                long j = this.f34290c;
                String str2 = this.f34292e;
                jSONObject.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                jSONObject.put("product", C61926c.m72691p(j));
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str2);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "this.toString()");
                ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject2, ",", ";", false));
                C32227p<? super Long, ? super String, C13598b0> pVar = this.f34289b.f176511j;
                if (pVar != null) {
                    pVar.invoke(Long.valueOf(this.f34290c), this.f34291d.getText().toString());
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            long j2 = this.f34290c;
            String str3 = this.f34292e;
            jSONObject3.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            jSONObject3.put("product", C61926c.m72691p(j2));
            jSONObject3.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3);
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "this.toString()");
            ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject4, ",", ";", false));
        }
    }

    public C11710g(Context context, String str, String str2, C62080b bVar, long j) {
        this.f34277d = context;
        this.f34278e = str;
        this.f34279f = str2;
        this.f34280g = bVar;
        this.f34281h = j;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        View inflate = View.inflate(this.f34277d, C0966R.C0971layout.cjy, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.lw8);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.c16);
        imageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_close2, this.f34277d.getResources().getColor(C0966R.color.BW_0_Alpha_0_3)));
        C62042e.f176370a.mo87028N1(editText, (TextView) null, 30, 15, false, new C11711a(editText, imageView));
        imageView.setOnClickListener(new C11712b(editText));
        editText.setText(this.f34278e);
        editText.postDelayed(new C11713c(editText, this.f34278e, this.f34280g), 300);
        C77426q qVar = new C77426q(this.f34277d);
        qVar.mo107606r(this.f34279f);
        qVar.mo107592d(inflate);
        qVar.mo107590b(new C11714d(this.f34277d, this.f34280g, this.f34281h, editText, this.f34278e));
        qVar.mo107603o();
        C77398g gVar = qVar.f225839c;
        Context context = this.f34277d;
        LinearLayout linearLayout = gVar.f225692f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.am6);
        }
        gVar.mo107540u(context.getResources().getColor(C0966R.color.a7f));
        gVar.f225695i.setTextColor(ColorStateList.valueOf(context.getResources().getColor(C0966R.color.a7f)));
    }
}
