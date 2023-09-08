package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.fav.p047ui.C93494c1;
import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import oc1.C100324a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView */
public class FavSearchActionView extends LinearLayout implements C111847h {

    /* renamed from: j */
    public static final /* synthetic */ int f198053j = 0;

    /* renamed from: d */
    public ImageButton f198054d;

    /* renamed from: e */
    public FavTagPanel f198055e;

    /* renamed from: f */
    public List<Integer> f198056f = new LinkedList();

    /* renamed from: g */
    public List<String> f198057g = new LinkedList();

    /* renamed from: h */
    public List<String> f198058h = new LinkedList();

    /* renamed from: i */
    public C68930c f198059i;

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView$a */
    public class C68928a implements FavTagPanel.C68935b {
        public C68928a() {
        }

        /* renamed from: a */
        public void mo94790a(String str) {
            FavSearchActionView favSearchActionView = FavSearchActionView.this;
            favSearchActionView.mo94833c(favSearchActionView.f198055e.getEditText());
            ((LinkedList) FavSearchActionView.this.f198057g).remove(str);
            FavSearchActionView.this.mo94832b();
            FavSearchActionView favSearchActionView2 = FavSearchActionView.this;
            C68930c cVar = favSearchActionView2.f198059i;
            if (cVar != null) {
                ((FavSearchUI.C93448i) cVar).mo128307a(favSearchActionView2.f198056f, favSearchActionView2.f198058h, favSearchActionView2.f198057g, true);
            }
        }

        /* renamed from: b */
        public void mo94791b(String str) {
            FavSearchActionView favSearchActionView = FavSearchActionView.this;
            int i = FavSearchActionView.f198053j;
            favSearchActionView.mo94833c(str);
            FavSearchActionView favSearchActionView2 = FavSearchActionView.this;
            ((FavSearchUI.C93448i) favSearchActionView2.f198059i).mo128307a(favSearchActionView2.f198056f, favSearchActionView2.f198058h, favSearchActionView2.f198057g, false);
        }

        /* renamed from: d */
        public void mo94792d(String str) {
            Log.m105919d("MicroMsg.FavSearchActionView", "unselected tag %s", str);
            FavSearchActionView.this.f198055e.mo101812o(str);
            mo94790a(str);
        }

        /* renamed from: g */
        public void mo94794g() {
            C68930c cVar = FavSearchActionView.this.f198059i;
            if (cVar != null) {
                FavSearchUI.C93448i iVar = (FavSearchUI.C93448i) cVar;
                iVar.getClass();
                Log.m105918d("MicroMsg.FavSearchUI", "on enter search, show tag panel");
                FavSearchUI favSearchUI = FavSearchUI.this;
                int i = FavSearchUI.f269788N;
                if (!favSearchUI.mo128298N7()) {
                    FavSearchUI.m118044L7(FavSearchUI.this);
                }
            }
        }

        /* renamed from: h */
        public void mo94799h(String str) {
            FavSearchActionView favSearchActionView = FavSearchActionView.this;
            favSearchActionView.mo94833c(favSearchActionView.f198055e.getEditText());
            FavSearchActionView.this.mo94832b();
            FavSearchActionView favSearchActionView2 = FavSearchActionView.this;
            C68930c cVar = favSearchActionView2.f198059i;
            if (cVar != null) {
                List<Integer> list = favSearchActionView2.f198056f;
                FavSearchUI.C93448i iVar = (FavSearchUI.C93448i) cVar;
                FavSearchUI.this.f269811p.post(new C93494c1(iVar, favSearchActionView2.f198058h, favSearchActionView2.f198057g, list));
                if (str != null) {
                    FavSearchUI favSearchUI = FavSearchUI.this;
                    favSearchUI.f269796H = str;
                    favSearchUI.f269794F.f293911g = C100324a.m131159a();
                    FavSearchUI.this.f269794F.f293915k = System.currentTimeMillis();
                } else {
                    FavSearchUI.this.f269796H = "";
                }
                FavSearchUI favSearchUI2 = FavSearchUI.this;
                FavoriteNormalAdapter favoriteNormalAdapter = favSearchUI2.f269809n;
                if (favoriteNormalAdapter != null) {
                    String str2 = favSearchUI2.f269796H;
                    if (str2 != null) {
                        favoriteNormalAdapter.f269972C = str2;
                    } else {
                        favoriteNormalAdapter.f269972C = "";
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo94800i(String str) {
        }

        /* renamed from: j */
        public void mo94801j(boolean z, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView$b */
    public class C68929b implements View.OnClickListener {
        public C68929b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FavSearchActionView favSearchActionView = FavSearchActionView.this;
            if (favSearchActionView.f198059i == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            FavTagPanel favTagPanel = favSearchActionView.f198055e;
            Iterator<MMTagPanel.C73208l> it = favTagPanel.f214939z.iterator();
            while (it.hasNext()) {
                MMTagPanel.C73208l next = it.next();
                favTagPanel.removeView(next.f214967b);
                favTagPanel.mo101811n(next);
            }
            favTagPanel.f214939z.clear();
            favTagPanel.mo101807h();
            FavSearchActionView.this.f198055e.mo101801g();
            ((LinkedList) FavSearchActionView.this.f198058h).clear();
            ((LinkedList) FavSearchActionView.this.f198057g).clear();
            FavSearchActionView favSearchActionView2 = FavSearchActionView.this;
            ((FavSearchUI.C93448i) favSearchActionView2.f198059i).mo128307a(favSearchActionView2.f198056f, favSearchActionView2.f198058h, favSearchActionView2.f198057g, true);
            FavSearchActionView.this.mo94832b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView$c */
    public interface C68930c {
    }

    public FavSearchActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static String m81174a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 3) {
            return context.getString(C0966R.string.cru);
        }
        if (i == 5) {
            return context.getString(C0966R.string.crs);
        }
        if (i == 6) {
            return context.getString(C0966R.string.crm);
        }
        if (i == 7) {
            return context.getString(C0966R.string.crn);
        }
        if (i == 8) {
            return context.getString(C0966R.string.crg);
        }
        if (i == 17) {
            return context.getString(C0966R.string.crq);
        }
        if (i == 18) {
            return context.getString(C0966R.string.cro);
        }
        switch (i) {
            case 20:
                return context.getString(C0966R.string.n6o);
            case 21:
                return context.getString(C0966R.string.crl);
            case 22:
                return context.getString(C0966R.string.crp);
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final void mo94832b() {
        if (!this.f198056f.isEmpty() || !this.f198057g.isEmpty()) {
            this.f198055e.setEditHint("");
        } else {
            this.f198055e.setEditHint(getResources().getString(C0966R.string.a2p));
        }
    }

    /* renamed from: c */
    public final void mo94833c(String str) {
        ((LinkedList) this.f198058h).clear();
        for (String str2 : Util.nullAs(str, "").split(" ")) {
            if (!Util.isNullOrNil(str2)) {
                ((LinkedList) this.f198058h).add(str2);
            }
        }
    }

    /* renamed from: d */
    public void mo94834d(int i, boolean z) {
        ((LinkedList) this.f198056f).clear();
        ((LinkedList) this.f198056f).add(Integer.valueOf(i));
        if (this.f198055e != null) {
            mo94832b();
            this.f198055e.setType(m81174a(getContext(), i));
            if (this.f198059i != null) {
                mo94833c(this.f198055e.getEditText());
                if (z) {
                    ((FavSearchUI.C93448i) this.f198059i).mo128307a(this.f198056f, this.f198058h, this.f198057g, false);
                }
                C115669n.INSTANCE.mo160131h(11126, 1);
            }
        }
    }

    public List<String> getSearchKeys() {
        FavTagPanel favTagPanel = this.f198055e;
        if (favTagPanel != null) {
            mo94833c(favTagPanel.getEditText());
        }
        return this.f198058h;
    }

    public List<String> getSearchTags() {
        return this.f198057g;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f198054d = (ImageButton) findViewById(C0966R.C0970id.f359133j51);
        FavTagPanel favTagPanel = (FavTagPanel) findViewById(C0966R.C0970id.cwr);
        this.f198055e = favTagPanel;
        if (favTagPanel != null) {
            favTagPanel.setEditTextColor(getResources().getColor(C0966R.color.f3139gn));
            this.f198055e.setTagTipsDrawable(0);
            this.f198055e.setTagHighlineBG(0);
            this.f198055e.setTagSelectedBG(0);
            this.f198055e.setTagSelectedTextColorRes(C0966R.color.akw);
            this.f198055e.setTagNormalBG(0);
            this.f198055e.setTagNormalTextColorRes(C0966R.color.al6);
            this.f198055e.setEditHint(getResources().getString(C0966R.string.a2p));
            this.f198055e.mo101809k(true);
            FavTagPanel favTagPanel2 = this.f198055e;
            favTagPanel2.f214927n = false;
            favTagPanel2.f214928o = true;
            favTagPanel2.setCallBack(new C68928a());
        }
        ImageButton imageButton = this.f198054d;
        if (imageButton != null) {
            imageButton.setOnClickListener(new C68929b());
        }
    }

    public void setOnSearchChangedListener(C68930c cVar) {
        this.f198059i = cVar;
    }
}
