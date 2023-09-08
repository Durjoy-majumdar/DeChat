package com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;
import nj3.C76874e0;
import x93.C53300b;
import x93.C53302d;
import x93.C53306f;
import x93.C53309g;
import x93.C53310i;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView */
public class GameMenuView extends LinearLayout {

    /* renamed from: d */
    public Context f119303d;

    /* renamed from: e */
    public LayoutInflater f119304e;

    /* renamed from: f */
    public View f119305f;

    /* renamed from: g */
    public LinearLayout f119306g;

    /* renamed from: h */
    public LinearLayout f119307h;

    /* renamed from: i */
    public C53310i f119308i;

    /* renamed from: j */
    public C53302d f119309j;

    /* renamed from: n */
    public C53300b f119310n;

    /* renamed from: o */
    public boolean f119311o = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView$a */
    public class C44034a extends DataSetObserver {
        public C44034a() {
        }

        public void onChanged() {
            GameMenuView.m48326a(GameMenuView.this);
        }

        public void onInvalidated() {
            GameMenuView.m48326a(GameMenuView.this);
        }
    }

    public GameMenuView(Context context) {
        super(context, (AttributeSet) null);
        boolean z = false;
        this.f119303d = context;
        this.f119304e = LayoutInflater.from(context);
        DisplayMetrics displayMetrics = this.f119303d.getResources().getDisplayMetrics();
        this.f119311o = displayMetrics.widthPixels > displayMetrics.heightPixels ? true : z;
        mo68646b();
    }

    /* renamed from: a */
    public static void m48326a(GameMenuView gameMenuView) {
        double d;
        double d2;
        double d3;
        int i;
        int count = gameMenuView.f119308i.getCount();
        if (count != 0) {
            int j = (gameMenuView.f119311o ? C76577a.m92159j(gameMenuView.f119303d) : C76577a.m92145A(gameMenuView.f119303d)) - (C76577a.m92155f(gameMenuView.f119303d, C0966R.dimen.aat) * 2);
            int f = C76577a.m92155f(gameMenuView.f119303d, C0966R.dimen.aas);
            int f2 = C76577a.m92155f(gameMenuView.f119303d, C0966R.dimen.aar);
            C53310i iVar = gameMenuView.f119308i;
            C76874e0 e0Var = iVar.f148907d;
            boolean z = true;
            if (e0Var == null || e0Var.size() == 0 || (iVar.f148907d.size() + 1) / 2 <= 4) {
                z = false;
            }
            if (z) {
                d2 = 9.0d;
                double d4 = (double) j;
                if (gameMenuView.f119311o) {
                    d3 = d4 - (((double) f2) * 0.375d);
                    i = f2 * 4;
                } else {
                    d3 = d4 - (((double) f) * 0.5d);
                    i = f * 4;
                }
                d = d3 - ((double) i);
            } else {
                d2 = 8.0d;
                d = (double) (j - (gameMenuView.f119311o ? f2 * 4 : f * 4));
            }
            int i2 = (int) (d / d2);
            LinearLayout.LayoutParams layoutParams = gameMenuView.f119311o ? i2 > 0 ? new LinearLayout.LayoutParams(f2, (i2 * 2) + f2) : new LinearLayout.LayoutParams(f2, f2) : i2 > 0 ? new LinearLayout.LayoutParams((i2 * 2) + f, f) : new LinearLayout.LayoutParams(f, f);
            for (int i3 = 0; i3 < count; i3++) {
                View view = gameMenuView.f119308i.getView(i3, (View) null, gameMenuView.f119306g);
                view.setOnClickListener(new C53309g(gameMenuView));
                view.setLayoutParams(layoutParams);
                if (i3 % 2 == 0) {
                    gameMenuView.f119306g.addView(view);
                } else {
                    gameMenuView.f119307h.addView(view);
                }
            }
            while (true) {
                int childCount = gameMenuView.f119306g.getChildCount();
                if (childCount <= 0) {
                    break;
                }
                int i4 = childCount - 1;
                View childAt = gameMenuView.f119306g.getChildAt(i4);
                if (childAt != null) {
                    if (childAt.getTag() != null) {
                        break;
                    }
                    gameMenuView.f119306g.removeViewAt(i4);
                } else {
                    gameMenuView.f119306g.removeViewAt(i4);
                }
            }
            while (true) {
                int childCount2 = gameMenuView.f119307h.getChildCount();
                if (childCount2 <= 0) {
                    break;
                }
                int i5 = childCount2 - 1;
                View childAt2 = gameMenuView.f119307h.getChildAt(i5);
                if (childAt2 != null) {
                    if (childAt2.getTag() != null) {
                        break;
                    }
                    gameMenuView.f119307h.removeViewAt(i5);
                } else {
                    gameMenuView.f119307h.removeViewAt(i5);
                }
            }
            if (gameMenuView.f119306g.getChildCount() == 0 && gameMenuView.f119307h.getChildCount() == 0) {
                C53300b bVar = gameMenuView.f119310n;
                if (bVar != null) {
                    C53306f.this.mo73932b();
                }
            } else if (gameMenuView.f119306g.getChildCount() == 0) {
                ((ViewGroup) gameMenuView.f119306g.getParent()).setVisibility(8);
            } else if (gameMenuView.f119307h.getChildCount() == 0) {
                ((ViewGroup) gameMenuView.f119307h.getParent()).setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo68646b() {
        View view;
        if (this.f119311o) {
            setOrientation(0);
            this.f119304e.inflate(C0966R.C0971layout.ax9, this, true);
            view = this.f119304e.inflate(C0966R.C0971layout.ax6, this, true);
        } else {
            setOrientation(1);
            this.f119304e.inflate(C0966R.C0971layout.ax_, this, true);
            view = this.f119304e.inflate(C0966R.C0971layout.ax7, this, true);
        }
        this.f119305f = view.findViewById(C0966R.C0970id.emc);
        this.f119306g = (LinearLayout) view.findViewById(C0966R.C0970id.emb);
        this.f119307h = (LinearLayout) view.findViewById(C0966R.C0970id.emd);
    }

    public void setAdapter(C53310i iVar) {
        this.f119308i = iVar;
        iVar.registerDataSetObserver(new C44034a());
        iVar.notifyDataSetChanged();
    }

    public void setDismissListener(C53300b bVar) {
        this.f119310n = bVar;
    }

    public void setGameMenuItemSelectedListener(C53302d dVar) {
        this.f119309j = dVar;
    }

    public GameMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f119303d = context;
        mo68646b();
    }
}
