package xv1;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C56782d;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kv1.C99251g;
import kv1.C99254i;
import pv1.C22019b;

/* renamed from: xv1.i */
public class C23125i extends C22019b {

    /* renamed from: p */
    public boolean f66424p;

    /* renamed from: q */
    public String f66425q;

    /* renamed from: r */
    public CharSequence f66426r;

    /* renamed from: s */
    public C23127b f66427s = new C23127b();

    /* renamed from: xv1.i$a */
    public class C23126a extends C22019b.C22020a {

        /* renamed from: a */
        public View f66428a;

        /* renamed from: b */
        public TextView f66429b;

        /* renamed from: c */
        public ImageView f66430c;

        /* renamed from: d */
        public View f66431d;

        public C23126a(C23125i iVar) {
            super(iVar);
        }
    }

    /* renamed from: xv1.i$b */
    public class C23127b extends C22019b.C22021b {
        public C23127b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C23126a aVar2 = (C23126a) aVar;
            C93938f0.m118698f(aVar2.f66428a, C23125i.this.f62326d);
            aVar2.f66429b.setText(((C23125i) bVar).f66426r);
            aVar2.f66430c.setImageResource(C0966R.raw.fts_more_button_icon);
            C23125i iVar = C23125i.this;
            if (iVar.f62324b == 0 || !iVar.f66424p) {
                View view = aVar2.f66431d;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = aVar2.f66431d;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.asy, viewGroup, false);
            C23126a aVar = new C23126a(C23125i.this);
            aVar.f66429b = (TextView) inflate.findViewById(C0966R.C0970id.kms);
            aVar.f66430c = (ImageView) inflate.findViewById(C0966R.C0970id.f2a);
            aVar.f66431d = inflate.findViewById(C0966R.C0970id.hqn);
            aVar.f66428a = inflate.findViewById(C0966R.C0970id.f359139j63);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Intent intent = new Intent();
            intent.putExtra("key_talker_query", C23125i.this.f62327e.f292123d[0]);
            intent.putExtra("key_query", C23125i.this.f62327e.f292123d[1]);
            intent.putExtra("Search_Scene", C23125i.this.f62330h);
            if (!Util.isNullOrNil(C23125i.this.f66425q)) {
                intent.putExtra("key_conv", C23125i.this.f66425q);
                intent.putExtra("detail_type", 1);
                C99251g.m129295p(context, ".ui.FTSConvTalkerMessageUI", intent);
            } else {
                C99251g.m129295p(context, ".ui.FTSTalkerMessageUI", intent);
            }
            return true;
        }
    }

    public C23125i(int i) {
        super(12, i);
        this.f62326d = false;
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        String str = this.f62327e.f292123d[0];
        TextPaint textPaint = C56782d.f162741e;
        CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, 200.0f, TextUtils.TruncateAt.MIDDLE);
        CharSequence ellipsize2 = TextUtils.ellipsize(this.f62327e.f292123d[1], textPaint, 400.0f, TextUtils.TruncateAt.MIDDLE);
        if (Util.isNullOrNil(this.f66425q)) {
            String string = context.getString(C0966R.string.f361248ii1);
            String string2 = context.getString(C0966R.string.f361249ii2);
            String string3 = context.getString(C0966R.string.f361250ii3);
            int length = string.length();
            int length2 = string.length() + ellipsize.length() + string2.length();
            this.f66426r = C99254i.m129315l(C99254i.m129315l(string + ellipsize + string2 + ellipsize2 + string3, length, ellipsize.length() + length), length2, ellipsize2.length() + length2);
            return;
        }
        String string4 = context.getString(C0966R.string.ii4);
        String string5 = context.getString(C0966R.string.f361249ii2);
        String string6 = context.getString(C0966R.string.f361250ii3);
        int length3 = string4.length();
        int length4 = string4.length() + ellipsize.length() + string5.length();
        this.f66426r = C99254i.m129315l(C99254i.m129315l(string4 + ellipsize + string5 + ellipsize2 + string6, length3, ellipsize.length() + length3), length4, ellipsize2.length() + length4);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66427s;
    }
}
