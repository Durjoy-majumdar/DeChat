package il1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fg1.C8022a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ok1.C11471u;
import wi1.C15408c;

/* renamed from: il1.e */
public abstract class C8961e {

    /* renamed from: d */
    public final Context f28306d;

    /* renamed from: e */
    public final View f28307e;

    /* renamed from: f */
    public final View f28308f;

    /* renamed from: g */
    public final C8022a f28309g;

    public C8961e(Context context, boolean z, C11471u.C11473b bVar, int i, C8480h hVar) {
        Context context2 = context;
        boolean z2 = (i & 2) != 0 ? true : z;
        C11471u.C11473b bVar2 = (i & 4) != 0 ? C11471u.C11473b.AUTO : bVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bVar2, "uiMode");
        this.f28306d = context2;
        View b = mo9448b();
        this.f28307e = b;
        View c = mo9764c();
        this.f28308f = c;
        C8022a aVar = new C8022a(context2, z2);
        if (b != null) {
            aVar.f26712h.addView(b);
            View view = aVar.f26710f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c != null) {
            aVar.f26716l.addView(c);
            aVar.f26717m.setVisibility(8);
        }
        aVar.f26718n = new C8939c(this);
        aVar.f26719o = new C8952d(this);
        View i2 = mo3427i(aVar.f26709e, bVar2);
        i2 = i2 == null ? LayoutInflater.from(aVar.f26705a).inflate(mo3425g(), aVar.f26709e, false) : i2;
        C87412m.m108593f(i2, "contentView");
        mo3428k(i2);
        boolean z3 = true;
        aVar.f26706b.f36933o = !(this instanceof C15408c);
        aVar.f26708d.setVisibility(mo3426h());
        String j = mo9449j();
        C87412m.m108594g(j, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (j.length() != 0 ? false : z3) {
            aVar.f26713i.setVisibility(8);
        } else {
            aVar.f26713i.setText(j);
            aVar.f26713i.setVisibility(0);
        }
        aVar.mo9110a("", "");
        aVar.f26709e.addView(i2);
        this.f28309g = aVar;
        if (b != null) {
            b.setOnClickListener(new C8930a(this));
        }
        if (c != null) {
            c.setOnClickListener(new C8935b(this));
        }
    }

    /* renamed from: a */
    public void mo9763a() {
        this.f28309g.f26706b.mo5085n();
    }

    /* renamed from: b */
    public View mo9448b() {
        return null;
    }

    /* renamed from: c */
    public View mo9764c() {
        return null;
    }

    /* renamed from: d */
    public WeImageView mo9765d() {
        WeImageView weImageView = new WeImageView(this.f28306d);
        weImageView.setImageResource(C0966R.raw.icons_outlined_arrow);
        weImageView.setRotation(180.0f);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.FG_0));
        weImageView.setLayoutParams(new ViewGroup.LayoutParams(C76577a.m92151b(weImageView.getContext(), 12), C76577a.m92151b(weImageView.getContext(), 24)));
        return weImageView;
    }

    /* renamed from: e */
    public TextView mo9766e() {
        TextView textView = new TextView(this.f28306d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
        textView.setBackground(textView.getContext().getResources().getDrawable(C0966R.C0969drawable.cjt));
        int b = C76577a.m92151b(textView.getContext(), 12);
        int b2 = C76577a.m92151b(textView.getContext(), 4);
        textView.setPadding(b, b2, b, b2);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2932f));
        textView.setText(textView.getContext().getResources().getString(C0966R.string.f8014z_));
        return textView;
    }

    /* renamed from: f */
    public TextView mo9767f() {
        TextView textView = new TextView(this.f28306d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(C0966R.dimen.f3726cf));
        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.FG_0));
        textView.setText(textView.getContext().getResources().getString(C0966R.string.f7926wf));
        return textView;
    }

    /* renamed from: g */
    public abstract int mo3425g();

    /* renamed from: h */
    public int mo3426h() {
        return 0;
    }

    /* renamed from: i */
    public View mo3427i(ViewGroup viewGroup, C11471u.C11473b bVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "uiMode");
        return null;
    }

    /* renamed from: j */
    public String mo9449j() {
        return "";
    }

    /* renamed from: k */
    public abstract void mo3428k(View view);

    /* renamed from: l */
    public void mo9450l() {
    }

    /* renamed from: m */
    public void mo3429m() {
    }

    /* renamed from: n */
    public void mo9451n() {
        mo9763a();
    }

    /* renamed from: o */
    public void mo9768o() {
        mo9763a();
    }

    /* renamed from: p */
    public void mo3431p() {
        this.f28309g.f26706b.mo5086o();
    }
}
