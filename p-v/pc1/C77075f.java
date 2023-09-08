package pc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: pc1.f */
public class C77075f extends LinearLayout {

    /* renamed from: d */
    public View f225132d;

    /* renamed from: e */
    public View f225133e;

    /* renamed from: f */
    public View f225134f;

    /* renamed from: g */
    public C77076a f225135g;

    /* renamed from: h */
    public boolean f225136h = false;

    /* renamed from: i */
    public boolean f225137i = false;

    /* renamed from: j */
    public int f225138j;

    /* renamed from: pc1.f$a */
    public interface C77076a {
    }

    public C77075f(Context context) {
        super(context);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f225132d = View.inflate(getContext(), C0966R.C0971layout.a76, (ViewGroup) null);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a6k, (ViewGroup) null);
        inflate.findViewById(C0966R.C0970id.hlq).setOnClickListener(new C77073d(this));
        this.f225133e = inflate;
        View inflate2 = View.inflate(getContext(), C0966R.C0971layout.a74, (ViewGroup) null);
        inflate2.findViewById(C0966R.C0970id.cx9).setOnClickListener(new C77074e(this));
        this.f225134f = inflate2;
        addView(this.f225132d, new LinearLayout.LayoutParams(layoutParams));
        addView(this.f225133e, new LinearLayout.LayoutParams(layoutParams));
        addView(this.f225134f, new LinearLayout.LayoutParams(layoutParams));
    }

    /* renamed from: a */
    public void mo107385a(boolean z) {
        View view = this.f225132d;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableOldVersionBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableOldVersionBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final void mo107386b(int i) {
        int i2 = i;
        this.f225138j = i2;
        Log.m105924i("MicroMsg.FavHeaderView", "showStatusBar status:" + i2);
        if (i2 == 0) {
            View view = this.f225134f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f225133e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i2 == 1) {
            if (!this.f225136h) {
                C115669n.INSTANCE.mo160131h(14109, 1);
            }
            this.f225136h = true;
            View view5 = this.f225134f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f225133e;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = this.f225133e.findViewById(C0966R.C0970id.hlu);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view9 = findViewById;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = this.f225133e.findViewById(C0966R.C0970id.hlv);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view10 = findViewById2;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i2 == 2) {
            View view11 = this.f225134f;
            C9556a aVar7 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar7.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view13 = this.f225133e;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i2 == 3) {
            if (!this.f225137i) {
                C115669n.INSTANCE.mo160131h(14109, 0);
            }
            this.f225137i = true;
            View view14 = this.f225134f;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar9.mo10233c(8);
            View view15 = view14;
            C117292a.m165358d(view15, aVar9.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view16 = this.f225133e;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(0);
            View view17 = view16;
            C117292a.m165358d(view17, aVar10.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view17, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = this.f225133e.findViewById(C0966R.C0970id.hlu);
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(8);
            View view18 = findViewById3;
            C117292a.m165358d(view18, aVar11.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = this.f225133e.findViewById(C0966R.C0970id.hlv);
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(0);
            View view19 = findViewById4;
            C117292a.m165358d(view19, aVar12.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view19, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public void mo107387c() {
        boolean z;
        long j;
        List<C100755z> TE = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142265TE();
        boolean z2 = true;
        if (TE != null) {
            j = 0;
            z = false;
            for (C100755z c : TE) {
                j += C100734q.m131840c(c);
                z = true;
            }
            Log.m105925i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", Integer.valueOf(TE.size()), Long.valueOf(j));
        } else {
            j = 0;
            z = false;
        }
        if (!z) {
            if (C100734q.m131828S() == 0 || C100734q.m131814E() >= 52428800) {
                z2 = false;
            }
            if (z2) {
                mo107386b(3);
            } else {
                mo107386b(0);
            }
        } else if (j > C100734q.m131814E()) {
            mo107386b(1);
        } else {
            mo107386b(2);
        }
    }

    public void setCleanFavSpace(C77076a aVar) {
        this.f225135g = aVar;
    }
}
