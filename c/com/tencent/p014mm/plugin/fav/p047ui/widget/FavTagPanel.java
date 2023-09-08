package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavSearchActionView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel */
public class FavTagPanel extends MMTagPanel {

    /* renamed from: M */
    public static final /* synthetic */ int f198066M = 0;

    /* renamed from: J */
    public LinkedList<MMTagPanel.C73208l> f198067J = new LinkedList<>();

    /* renamed from: K */
    public C68935b f198068K = null;

    /* renamed from: L */
    public View.OnClickListener f198069L = new C68932a();

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel$a */
    public class C68932a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel$a$a */
        public class C68933a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f198071d;

            public C68933a(View view) {
                this.f198071d = view;
            }

            public void run() {
                C68935b bVar = FavTagPanel.this.f198068K;
                ((TextView) this.f198071d).getText().toString();
                bVar.getClass();
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel$a$b */
        public class C68934b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f198073d;

            public C68934b(View view) {
                this.f198073d = view;
            }

            public void run() {
                C68935b bVar = FavTagPanel.this.f198068K;
                String charSequence = ((TextView) this.f198073d).getText().toString();
                FavSearchActionView.C68928a aVar = (FavSearchActionView.C68928a) bVar;
                aVar.getClass();
                Log.m105919d("MicroMsg.FavSearchActionView", "unselected type %s", charSequence);
                FavSearchActionView.this.f198055e.getClass();
                FavSearchActionView favSearchActionView = FavSearchActionView.this;
                favSearchActionView.mo94833c(favSearchActionView.f198055e.getEditText());
                FavSearchActionView favSearchActionView2 = FavSearchActionView.this;
                List<Integer> list = favSearchActionView2.f198056f;
                Context context = favSearchActionView2.getContext();
                int i = -1;
                if (context != null) {
                    if (context.getString(C0966R.string.crl).equals(charSequence)) {
                        i = 21;
                    } else if (context.getString(C0966R.string.crs).equals(charSequence)) {
                        i = 5;
                    } else if (context.getString(C0966R.string.crg).equals(charSequence)) {
                        i = 8;
                    } else if (context.getString(C0966R.string.crn).equals(charSequence)) {
                        i = 7;
                    } else if (context.getString(C0966R.string.crq).equals(charSequence)) {
                        i = 17;
                    } else if (context.getString(C0966R.string.cru).equals(charSequence)) {
                        i = 3;
                    } else if (context.getString(C0966R.string.cro).equals(charSequence)) {
                        i = 18;
                    } else if (context.getString(C0966R.string.crm).equals(charSequence)) {
                        i = 6;
                    }
                }
                ((LinkedList) list).remove(i);
                FavSearchActionView.this.mo94832b();
                FavSearchActionView favSearchActionView3 = FavSearchActionView.this;
                FavSearchActionView.C68930c cVar = favSearchActionView3.f198059i;
                if (cVar != null) {
                    ((FavSearchUI.C93448i) cVar).mo128307a(favSearchActionView3.f198056f, favSearchActionView3.f198058h, favSearchActionView3.f198057g, true);
                }
            }
        }

        public C68932a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((Integer) view.getTag()).intValue() == 0) {
                int i = FavTagPanel.f198066M;
                FavTagPanel.this.mo101836t((TextView) view, true, false);
                if (FavTagPanel.this.f198068K != null) {
                    view.post(new C68933a(view));
                }
            } else {
                int i2 = FavTagPanel.f198066M;
                FavTagPanel.this.mo101836t((TextView) view, false, false);
                if (FavTagPanel.this.f198068K != null) {
                    view.post(new C68934b(view));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel$b */
    public interface C68935b extends MMTagPanel.C73201i {
    }

    public FavTagPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: m */
    public void mo94842m() {
    }

    public void setCallBack(C68935b bVar) {
        this.f198068K = bVar;
        super.setCallBack(bVar);
    }

    public void setType(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
            return;
        }
        String trim = str.trim();
        Iterator<MMTagPanel.C73208l> it = this.f198067J.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next().f214966a)) {
                Log.m105929w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", trim);
                return;
            }
        }
        this.f198067J.clear();
        MMTagPanel.C73208l i = mo101808i();
        this.f198067J.add(i);
        mo101815s(i, trim, true);
        i.f214967b.setOnClickListener(this.f198069L);
        removeViews(0, getChildCount() - 1);
        addView(i.f214967b, 0);
        mo101807h();
    }

    public FavTagPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
