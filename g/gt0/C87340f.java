package gt0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.AuthorizeItemListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import lb0.C88394b;
import lb0.C88431k;

/* renamed from: gt0.f */
public class C87340f extends C87325b {

    /* renamed from: X */
    public AuthorizeItemListView f253126X;

    /* renamed from: Y */
    public LinearLayout f253127Y;

    /* renamed from: Z */
    public Context f253128Z;

    /* renamed from: gt0.f$a */
    public interface C87341a {
        /* renamed from: a */
        void mo114547a(int i, ArrayList<String> arrayList);
    }

    /* renamed from: gt0.f$b */
    public static final class C87342b extends BaseAdapter {

        /* renamed from: d */
        public final ArrayList<C87345c> f253129d;

        /* renamed from: gt0.f$b$a */
        public class C87343a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C87345c f253130d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f253131e;

            public C87343a(C87342b bVar, C87345c cVar, ImageView imageView) {
                this.f253130d = cVar;
                this.f253131e = imageView;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = this.f253130d.f253135b;
                if (i == 2) {
                    this.f253131e.setImageResource(C0966R.C0969drawable.c5d);
                    this.f253130d.f253135b = 1;
                } else if (i == 1) {
                    this.f253131e.setImageResource(C0966R.C0969drawable.c5b);
                    this.f253130d.f253135b = 2;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: gt0.f$b$b */
        public static final class C87344b {

            /* renamed from: a */
            public ImageView f253132a;

            /* renamed from: b */
            public TextView f253133b;
        }

        public C87342b(ArrayList<C87345c> arrayList) {
            this.f253129d = arrayList;
        }

        public int getCount() {
            ArrayList<C87345c> arrayList = this.f253129d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public Object getItem(int i) {
            return this.f253129d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C87344b bVar;
            ArrayList<C87345c> arrayList = this.f253129d;
            if (arrayList == null || arrayList.size() <= 0) {
                return null;
            }
            C87345c cVar = this.f253129d.get(i);
            if (view == null) {
                bVar = new C87344b();
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f6526h_, (ViewGroup) null);
                bVar.f253132a = (ImageView) view2.findViewById(C0966R.C0970id.f5861qo);
                bVar.f253133b = (TextView) view2.findViewById(C0966R.C0970id.f5860qn);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C87344b) view.getTag();
            }
            int i2 = cVar.f253135b;
            if (i2 == 1) {
                bVar.f253132a.setImageResource(C0966R.C0969drawable.c5d);
            } else if (i2 == 3) {
                bVar.f253132a.setImageResource(C0966R.C0969drawable.c5c);
            } else {
                bVar.f253132a.setImageResource(C0966R.C0969drawable.c5b);
            }
            bVar.f253133b.setText(cVar.f253136c);
            ImageView imageView = bVar.f253132a;
            imageView.setOnClickListener(new C87343a(this, cVar, imageView));
            return view2;
        }
    }

    /* renamed from: gt0.f$c */
    public static class C87345c {

        /* renamed from: a */
        public String f253134a;

        /* renamed from: b */
        public int f253135b;

        /* renamed from: c */
        public String f253136c;
    }

    public C87340f(Context context, List<C87345c> list, String str, String str2, C87341a aVar) {
        super(context, C0966R.style.a68);
        this.f253128Z = context;
        String nullAsNil = Util.nullAsNil(str);
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException("scopeInfoList is empty or null");
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f253128Z).inflate(C0966R.C0971layout.f6383dc, (ViewGroup) null);
        setContentView((View) viewGroup);
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122785a((ImageView) viewGroup.findViewById(C0966R.C0970id.f6038vk), str2, C0966R.C0969drawable.c8n, C88431k.f255437d);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.f6057w4)).setText(this.f253128Z.getString(C0966R.string.gc5, new Object[]{nullAsNil}));
        this.f253126X = (AuthorizeItemListView) viewGroup.findViewById(C0966R.C0970id.a0b);
        this.f253126X.setAdapter(new C87342b(arrayList));
        if (arrayList.size() > 5) {
            this.f253126X.f214735d = arrayList.size();
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.a0n);
            this.f253127Y = linearLayout;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.height = this.f253128Z.getResources().getDimensionPixelSize(C0966R.dimen.adl);
            this.f253127Y.setLayoutParams(layoutParams);
        }
        ((Button) viewGroup.findViewById(C0966R.C0970id.g5f)).setOnClickListener(new C87326c(this, arrayList, aVar, this));
        ((Button) viewGroup.findViewById(C0966R.C0970id.g6d)).setOnClickListener(new C87329d(this, arrayList, aVar, this));
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new C87338e(this, aVar));
    }
}
