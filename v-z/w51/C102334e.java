package w51;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93102b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k60.C99101e;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import t61.C101728d;
import t61.C101735i;
import u61.C101963g;

/* renamed from: w51.e */
public class C102334e extends ArrayAdapter<C101728d> {

    /* renamed from: d */
    public int f301413d;

    /* renamed from: e */
    public Context f301414e;

    /* renamed from: f */
    public C93102b0 f301415f;

    /* renamed from: w51.e$a */
    public class C102335a {

        /* renamed from: a */
        public View f301416a;

        /* renamed from: b */
        public ImageView f301417b;

        /* renamed from: c */
        public TextView f301418c;

        public C102335a(C102334e eVar, View view) {
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.chz);
            this.f301417b = (ImageView) view.findViewById(C0966R.C0970id.chx);
            this.f301418c = (TextView) view.findViewById(C0966R.C0970id.chy);
            this.f301416a = view.findViewById(C0966R.C0970id.cfv);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = eVar.f301413d;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public C102334e(Context context, C93102b0 b0Var) {
        super(context, C0966R.C0971layout.a2c, b0Var.getDataList());
        this.f301413d = context.getResources().getDimensionPixelSize(C0966R.dimen.f357024a41);
        this.f301414e = context;
        this.f301415f = b0Var;
        for (C101728d b : b0Var.getDataList()) {
            Log.m105925i("MicroMsg.emoji.EmojiSortAdapter", "before sort %s", b.mo141165b());
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102335a aVar;
        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(this.f301414e).inflate(C0966R.C0971layout.a2c, (ViewGroup) null);
            aVar = new C102335a(this, view);
            view.setTag(aVar);
        } else {
            aVar = (C102335a) view.getTag();
        }
        C101735i iVar = (C101735i) getItem(i);
        if (C101963g.m134217b(iVar.mo141165b())) {
            aVar.f301418c.setText(C0966R.string.c_9);
        } else {
            aVar.f301418c.setText(iVar.mo141166c());
        }
        if (C101963g.m134217b(iVar.mo141165b())) {
            aVar.f301417b.setImageResource(C0966R.C0969drawable.icon_002_cover);
        } else {
            C99101e eVar = C99101e.f290570a;
            C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(iVar.mo141164a());
            C100075f.C100076a aVar2 = new C100075f.C100076a();
            aVar2.f293176b = true;
            e.f291319c = aVar2.mo139398a();
            ((C99342a) e).mo85954d(aVar.f301417b);
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
