package n21;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.EditorFileUI;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C9556a;
import p21.C100616a;
import p21.C100618c;
import t21.C101712a;
import te3.C101834rc0;
import v21.C102132i;
import x21.C102538a;

/* renamed from: n21.f */
public abstract class C100047f extends C100040a {

    /* renamed from: R */
    public static float f293075R = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: S */
    public static int f293076S = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: T */
    public static int f293077T = ((int) ((f293075R * 40.0f) + 0.5f));

    /* renamed from: A */
    public C100616a f293078A;

    /* renamed from: B */
    public ImageView f293079B;

    /* renamed from: C */
    public WXRTEditText f293080C;

    /* renamed from: D */
    public WXRTEditText f293081D;

    /* renamed from: E */
    public LinearLayout f293082E;

    /* renamed from: F */
    public TextView f293083F;

    /* renamed from: G */
    public TextView f293084G;

    /* renamed from: H */
    public ImageView f293085H;

    /* renamed from: I */
    public View f293086I;

    /* renamed from: J */
    public LinearLayout f293087J;

    /* renamed from: K */
    public LinearLayout f293088K;

    /* renamed from: L */
    public LinearLayout f293089L;

    /* renamed from: M */
    public LinearLayout f293090M;

    /* renamed from: N */
    public LinearLayout f293091N;

    /* renamed from: P */
    public LinearLayout f293092P;

    /* renamed from: Q */
    public View.OnClickListener f293093Q = new C100051d();

    /* renamed from: n21.f$a */
    public class C100048a implements View.OnClickListener {
        public C100048a(C100047f fVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102132i.m134538h().mo141655c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: n21.f$b */
    public class C100049b implements View.OnClickListener {
        public C100049b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100047f.this.f293081D.mo127558x();
            C100047f.this.f293081D.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: n21.f$c */
    public class C100050c implements View.OnClickListener {
        public C100050c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100047f.this.f293080C.mo127558x();
            C100047f.this.f293080C.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: n21.f$d */
    public class C100051d implements View.OnClickListener {
        public C100051d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorUI editorUI = (EditorUI) C100047f.this.f293067z.f268166b;
            editorUI.getClass();
            C102538a aVar = editorUI.f268045g;
            if (aVar != null) {
                aVar.mo142159d((C101712a) null);
            }
            Context context = C100047f.this.f293079B.getContext();
            if (C100047f.this.mo139367y() == 5) {
                C100618c cVar = (C100618c) C100047f.this.f293078A;
                Intent intent = new Intent(context, EditorFileUI.class);
                try {
                    C101834rc0 rc02 = cVar.f294808m;
                    if (rc02 == null) {
                        rc02 = cVar.f294809n;
                    }
                    intent.putExtra("data_item_key", rc02.toByteArray());
                } catch (IOException unused) {
                }
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C100047f.this.mo139367y();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100047f(View view, C93083b bVar) {
        super(view, bVar);
        this.f293079B = (ImageView) view.findViewById(C0966R.C0970id.cav);
        this.f293086I = view.findViewById(C0966R.C0970id.l4x);
        this.f293082E = (LinearLayout) view.findViewById(C0966R.C0970id.hid);
        this.f293087J = (LinearLayout) view.findViewById(C0966R.C0970id.hj4);
        this.f293083F = (TextView) view.findViewById(C0966R.C0970id.hie);
        this.f293084G = (TextView) view.findViewById(C0966R.C0970id.hib);
        this.f293085H = (ImageView) view.findViewById(C0966R.C0970id.hic);
        this.f293083F.setTextSize(16.0f);
        this.f293084G.setTextSize(12.0f);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f358870hj2);
        this.f293088K = linearLayout;
        linearLayout.setVisibility(8);
        ((LinearLayout) view.findViewById(C0966R.C0970id.hix)).setVisibility(8);
        ((LinearLayout) view.findViewById(C0966R.C0970id.hia)).setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.hpr);
        this.f293090M = linearLayout2;
        linearLayout2.setBackgroundColor(1347529272);
        this.f293090M.setVisibility(8);
        this.f293090M.setOnClickListener(new C100048a(this));
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C0966R.C0970id.hpv);
        this.f293091N = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        this.f293091N.setVisibility(4);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(C0966R.C0970id.hpt);
        this.f293092P = linearLayout4;
        linearLayout4.setBackgroundColor(1347529272);
        this.f293092P.setVisibility(4);
        LinearLayout linearLayout5 = (LinearLayout) view.findViewById(C0966R.C0970id.cbj);
        this.f293089L = linearLayout5;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout5.getLayoutParams();
        layoutParams.width = f293076S - f293077T;
        layoutParams.height = -2;
        this.f293089L.setLayoutParams(layoutParams);
        this.f293081D = (WXRTEditText) view.findViewById(C0966R.C0970id.al4);
        this.f293080C = (WXRTEditText) view.findViewById(C0966R.C0970id.al6);
        ((LinearLayout) view.findViewById(C0966R.C0970id.al5)).setOnClickListener(new C100049b());
        ((LinearLayout) view.findViewById(C0966R.C0970id.al7)).setOnClickListener(new C100050c());
        this.f293081D.setEditTextType(2);
        this.f293080C.setEditTextType(1);
        WXRTEditText wXRTEditText = this.f293080C;
        wXRTEditText.f268132F = this;
        this.f293081D.f268132F = this;
        this.f293067z.mo127572f(wXRTEditText);
        this.f293067z.mo127572f(this.f293081D);
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        Log.m105925i("MicroMsg.EditorOtherItemHolder", "ImageItemHolder position is %d, editable:%b", Integer.valueOf(mo17364k()), Boolean.valueOf(this.f293067z.f268168d));
        this.f293078A = aVar;
        this.f293080C.setPosInDataList(i);
        this.f293081D.setPosInDataList(i);
        if (C102132i.f300744K) {
            C102132i.m134538h().mo141650D(this.f293090M, this.f293091N, this.f293092P, i);
        }
        WXRTEditText wXRTEditText = this.f293080C;
        aVar.f294798d = wXRTEditText;
        WXRTEditText wXRTEditText2 = this.f293081D;
        aVar.f294799e = wXRTEditText2;
        aVar.f294800f = null;
        if (!aVar.f294796b) {
            if (wXRTEditText.hasFocus()) {
                this.f293080C.clearFocus();
            }
            if (this.f293081D.hasFocus()) {
                this.f293081D.clearFocus();
            }
        } else if (aVar.f294801g) {
            wXRTEditText.requestFocus();
        } else {
            wXRTEditText2.requestFocus();
        }
        if (this.f293082E.getVisibility() != 0) {
            return;
        }
        if (aVar.f294802h) {
            this.f293082E.setBackgroundResource(C0966R.C0969drawable.f4913r5);
        } else {
            this.f293082E.setBackgroundResource(C0966R.C0969drawable.f4912r4);
        }
    }
}
