package il1;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;
import zp3.C79406f;

/* renamed from: il1.j6 */
public final class C46261j6 {

    /* renamed from: a */
    public final TextView f124704a;

    /* renamed from: b */
    public final WeImageView f124705b;

    /* renamed from: c */
    public String f124706c = "";

    /* renamed from: il1.j6$a */
    public static final class C46262a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C46261j6 f124707d;

        /* renamed from: e */
        public final /* synthetic */ Context f124708e;

        public C46262a(C46261j6 j6Var, Context context) {
            this.f124707d = j6Var;
            this.f124708e = context;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveStatisticsWidget$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Object systemService = MMApplicationContext.getContext().getSystemService("clipboard");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setText(this.f124707d.f124704a.getText() + "cdnUrl:" + this.f124707d.f124706c + 10);
            C76701a.makeText(this.f124708e, (CharSequence) "copy done", 0).show();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveStatisticsWidget$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public C46261j6(Context context, ViewGroup viewGroup) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "rootView");
        TextView textView = new TextView(context);
        this.f124704a = textView;
        WeImageView weImageView = new WeImageView(context);
        this.f124705b = weImageView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        textView.setTextSize(0, MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3651a_));
        textView.setBackgroundResource(C0966R.C0969drawable.f357193a24);
        textView.setPadding(C79406f.m96347a(MMApplicationContext.getContext(), 10.0f), textView.getPaddingTop(), C79406f.m96347a(MMApplicationContext.getContext(), 10.0f), textView.getPaddingBottom());
        Resources resources = context.getResources();
        weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_close, resources != null ? resources.getColor(C0966R.color.BW_100_Alpha_0_5) : -1));
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C79406f.m96347a(MMApplicationContext.getContext(), 150.0f);
            viewGroup.addView(textView, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) context.getResources().getDimension(C0966R.dimen.f3738cr), (int) context.getResources().getDimension(C0966R.dimen.f3738cr));
            layoutParams2.topMargin = C79406f.m96347a(MMApplicationContext.getContext(), 150.0f);
            viewGroup.addView(weImageView, layoutParams2);
        } else {
            viewGroup.addView(textView);
            viewGroup.addView(weImageView);
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        int dimensionPixelOffset = (int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).x) - ((float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a7k)));
        if (dimensionPixelOffset > 0) {
            layoutParams3.width = dimensionPixelOffset;
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp));
        }
        textView.setOnLongClickListener(new C46262a(this, context));
    }
}
