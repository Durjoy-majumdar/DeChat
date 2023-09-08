package gl3;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gl3.C75922b;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99671h;
import p629ny.C76979h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: gl3.e */
public final class C75929e extends C75921a {

    /* renamed from: B */
    public final boolean f222643B;

    /* renamed from: C */
    public final C13601g f222644C = C36568h.m40985a(new C75933d(this));

    /* renamed from: D */
    public final C13601g f222645D = C36568h.m40985a(new C75932c(this));

    /* renamed from: E */
    public C99671h f222646E;

    /* renamed from: F */
    public CharSequence f222647F;

    /* renamed from: gl3.e$a */
    public final class C75930a implements C75922b.C75923a {

        /* renamed from: a */
        public View f222648a;

        /* renamed from: b */
        public ImageView f222649b;

        /* renamed from: c */
        public CheckBox f222650c;

        /* renamed from: d */
        public TextView f222651d;

        /* renamed from: e */
        public TextView f222652e;

        public C75930a(C75929e eVar) {
        }
    }

    /* renamed from: gl3.e$b */
    public final class C75931b implements C75922b.C75924b {

        /* renamed from: a */
        public final boolean f222653a;

        public C75931b(boolean z) {
            this.f222653a = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67029a(android.content.Context r6, gl3.C75922b.C75923a r7, gl3.C75922b r8, boolean r9, boolean r10) {
            /*
                r5 = this;
                boolean r6 = r7 instanceof gl3.C75929e.C75930a
                if (r6 == 0) goto L_0x0096
                boolean r6 = r8 instanceof gl3.C75929e
                if (r6 == 0) goto L_0x0096
                gl3.e r8 = (gl3.C75929e) r8
                java.lang.String r6 = r8.f222602y
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x001d
                int r6 = r6.length()
                if (r6 <= 0) goto L_0x0018
                r6 = 1
                goto L_0x0019
            L_0x0018:
                r6 = 0
            L_0x0019:
                if (r6 != r0) goto L_0x001d
                r6 = 1
                goto L_0x001e
            L_0x001d:
                r6 = 0
            L_0x001e:
                if (r6 == 0) goto L_0x0040
                r6 = r7
                gl3.e$a r6 = (gl3.C75929e.C75930a) r6
                android.widget.ImageView r2 = r6.f222649b
                if (r2 != 0) goto L_0x0028
                goto L_0x002d
            L_0x0028:
                java.lang.String r3 = r8.f222602y
                r2.setTag(r3)
            L_0x002d:
                java.lang.Class<ln.f> r2 = p196ln.C76705f.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ln.f r2 = (p196ln.C76705f) r2
                android.widget.ImageView r6 = r6.f222649b
                java.lang.String r3 = r8.f222602y
                r4 = 1036831949(0x3dcccccd, float:0.1)
                r2.D20(r6, r3, r4)
                goto L_0x004d
            L_0x0040:
                r6 = r7
                gl3.e$a r6 = (gl3.C75929e.C75930a) r6
                android.widget.ImageView r6 = r6.f222649b
                if (r6 == 0) goto L_0x004d
                r2 = 2131231871(0x7f08047f, float:1.8079835E38)
                r6.setImageResource(r2)
            L_0x004d:
                gl3.e$a r7 = (gl3.C75929e.C75930a) r7
                android.widget.CheckBox r6 = r7.f222650c
                if (r6 == 0) goto L_0x0088
                boolean r2 = r5.f222653a
                if (r2 == 0) goto L_0x0080
                r6.setVisibility(r1)
                r2 = 2131234031(0x7f080cef, float:1.8084216E38)
                r6.setBackgroundResource(r2)
                if (r9 == 0) goto L_0x0079
                r6.setChecked(r0)
                r6.setEnabled(r1)
                boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r9 == 0) goto L_0x0072
                r9 = 2131755400(0x7f100188, float:1.9141678E38)
                goto L_0x0075
            L_0x0072:
                r9 = 2131755399(0x7f100187, float:1.9141676E38)
            L_0x0075:
                r6.setBackgroundResource(r9)
                goto L_0x0088
            L_0x0079:
                r6.setChecked(r10)
                r6.setEnabled(r0)
                goto L_0x0088
            L_0x0080:
                if (r6 != 0) goto L_0x0083
                goto L_0x0088
            L_0x0083:
                r9 = 8
                r6.setVisibility(r9)
            L_0x0088:
                java.lang.CharSequence r6 = r8.f222601x
                android.widget.TextView r9 = r7.f222651d
                com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118693a(r6, r9)
                java.lang.CharSequence r6 = r8.f222647F
                android.widget.TextView r7 = r7.f222652e
                com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118693a(r6, r7)
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gl3.C75929e.C75931b.mo67029a(android.content.Context, gl3.b$a, gl3.b, boolean, boolean):void");
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
            C75930a aVar = (C75930a) ((C36570n) C75929e.this.f222645D).getValue();
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.ChatroomMemberDataItem.ChatroomMemberViewHolder");
            View findViewById = inflate.findViewById(C0966R.C0970id.a27);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f222649b = (ImageView) findViewById;
            View findViewById2 = inflate.findViewById(C0966R.C0970id.j9g);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.CheckBox");
            aVar.f222650c = (CheckBox) findViewById2;
            View findViewById3 = inflate.findViewById(C0966R.C0970id.kpm);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f222651d = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(C0966R.C0970id.c2h);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f222652e = (TextView) findViewById4;
            aVar.f222648a = inflate.findViewById(C0966R.C0970id.j_7);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    /* renamed from: gl3.e$c */
    public static final class C75932c extends C87413o implements C32224a<C75930a> {

        /* renamed from: d */
        public final /* synthetic */ C75929e f222655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75932c(C75929e eVar) {
            super(0);
            this.f222655d = eVar;
        }

        public Object invoke() {
            return new C75930a(this.f222655d);
        }
    }

    /* renamed from: gl3.e$d */
    public static final class C75933d extends C87413o implements C32224a<C75931b> {

        /* renamed from: d */
        public final /* synthetic */ C75929e f222656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75933d(C75929e eVar) {
            super(0);
            this.f222656d = eVar;
        }

        public Object invoke() {
            C75929e eVar = this.f222656d;
            return new C75931b(eVar.f222643B);
        }
    }

    public C75929e(int i, boolean z) {
        super(8, i);
        this.f222643B = z;
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        TextPaint paint;
        Class cls = C75700k0.class;
        Class cls2 = C76979h.class;
        if (aVar instanceof C75930a) {
            C99671h hVar = this.f222646E;
            TextPaint textPaint = null;
            String str = hVar != null ? hVar.f292113e : null;
            if (hVar != null && str != null) {
                this.f222602y = hVar.f292113e;
                C72996z1 W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(str);
                if (W2 == null) {
                    W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(str);
                }
                mo106181j(W2);
                String pb = ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(this.f222600A.getUsername(), this.f222620q);
                if (C87412m.m108589b(pb, hVar.f292114f)) {
                    this.f222601x = ((C76979h) C86312j.m106911c(cls2)).op0(context, pb, C76577a.m92157h(context, C0966R.dimen.f3927j7));
                    C99667f fVar = new C99667f();
                    fVar.f292088a = this.f222601x;
                    fVar.f292089b = this.f222603z;
                    fVar.f292090c = hVar.f292117i;
                    fVar.f292091d = hVar.f292118j;
                    TextView textView = ((C75930a) aVar).f222652e;
                    if (textView != null) {
                        textPaint = textView.getPaint();
                    }
                    fVar.f292095h = textPaint;
                    this.f222601x = C99254i.m129308e(fVar).f292107a;
                    return;
                }
                this.f222601x = ((C76979h) C86312j.m106911c(cls2)).op0(context, pb, C76577a.m92157h(context, C0966R.dimen.f3927j7));
                C76979h hVar2 = (C76979h) C86312j.m106911c(cls2);
                String str2 = hVar.f292114f;
                C75930a aVar2 = (C75930a) aVar;
                TextView textView2 = aVar2.f222652e;
                SpannableString yp02 = hVar2.yp0(context, str2, (textView2 == null || (paint = textView2.getPaint()) == null) ? 0.0f : paint.getTextSize());
                C87412m.m108593f(yp02, "getService(ISpannableSer…V?.paint?.textSize ?: 0f)");
                C99667f fVar2 = new C99667f();
                fVar2.f292088a = yp02;
                fVar2.f292089b = this.f222603z;
                fVar2.f292090c = hVar.f292117i;
                fVar2.f292091d = hVar.f292118j;
                TextView textView3 = aVar2.f222652e;
                if (textView3 != null) {
                    textPaint = textView3.getPaint();
                }
                fVar2.f292095h = textPaint;
                this.f222647F = C99254i.m129308e(fVar2).f292107a;
            }
        }
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return (C75931b) ((C36570n) this.f222644C).getValue();
    }
}
