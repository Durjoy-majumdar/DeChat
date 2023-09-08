package x93;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuView;
import nj3.C76874e0;

/* renamed from: x93.f */
public class C53306f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public C15629h f148892d;

    /* renamed from: e */
    public Context f148893e;

    /* renamed from: f */
    public C53301c f148894f;

    /* renamed from: g */
    public C76874e0 f148895g;

    /* renamed from: h */
    public GameMenuView f148896h;

    /* renamed from: i */
    public C53310i f148897i;

    /* renamed from: j */
    public boolean f148898j = false;

    /* renamed from: n */
    public View f148899n;

    /* renamed from: o */
    public ViewTreeObserver f148900o;

    /* renamed from: p */
    public boolean f148901p;

    /* renamed from: q */
    public boolean f148902q = false;

    /* renamed from: x93.f$a */
    public class C53307a implements DialogInterface.OnDismissListener {
        public C53307a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C53306f.this.mo73932b();
        }
    }

    /* renamed from: x93.f$b */
    public class C53308b implements C53300b {
        public C53308b() {
        }
    }

    public C53306f(Context context) {
        this.f148893e = context;
        if (context instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f148899n = viewGroup.getChildAt(0);
            } else {
                this.f148899n = viewGroup;
            }
        }
        Context context2 = this.f148893e;
        this.f148895g = new C76874e0(context2);
        this.f148892d = new C15629h(context2, 0);
        this.f148896h = new GameMenuView(context2);
        C53310i iVar = new C53310i(context2);
        this.f148897i = iVar;
        this.f148896h.setAdapter(iVar);
        this.f148898j = mo73931a();
        this.f148892d.setContentView((View) this.f148896h);
    }

    /* renamed from: a */
    public final boolean mo73931a() {
        DisplayMetrics displayMetrics = this.f148893e.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels;
    }

    /* renamed from: b */
    public void mo73932b() {
        ViewTreeObserver viewTreeObserver = this.f148900o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f148900o = this.f148899n.getViewTreeObserver();
            }
            this.f148900o.removeGlobalOnLayoutListener(this);
            this.f148900o = null;
        }
        C15629h hVar = this.f148892d;
        if (hVar != null) {
            hVar.dismiss();
        }
    }

    /* renamed from: c */
    public void mo73933c() {
        this.f148898j = mo73931a();
        C53301c cVar = this.f148894f;
        if (cVar != null) {
            cVar.onCreateMMMenu(this.f148895g);
        }
        if (this.f148892d != null) {
            C53310i iVar = this.f148897i;
            if (iVar != null) {
                iVar.f148907d = this.f148895g;
                iVar.notifyDataSetChanged();
            }
            this.f148892d.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f148901p) {
                this.f148892d.getWindow().addFlags(1024);
            }
            boolean z = false;
            if (this.f148902q) {
                this.f148892d.getWindow().setFlags(8, 8);
                this.f148892d.getWindow().addFlags(131200);
                this.f148892d.getWindow().getDecorView().setSystemUiVisibility(6);
            } else {
                this.f148892d.getWindow().clearFlags(8);
                this.f148892d.getWindow().clearFlags(131072);
                this.f148892d.getWindow().clearFlags(128);
                this.f148892d.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            View view = this.f148899n;
            if (view != null) {
                if (this.f148900o == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f148900o = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            this.f148892d.setOnDismissListener(new C53307a());
            GameMenuView gameMenuView = this.f148896h;
            if (gameMenuView != null) {
                gameMenuView.setDismissListener(new C53308b());
            }
            this.f148892d.show();
        }
    }

    public void onGlobalLayout() {
        C15629h hVar = this.f148892d;
        boolean z = true;
        if (hVar != null && hVar.isShowing()) {
            View view = this.f148899n;
            if (view == null || !view.isShown()) {
                mo73932b();
                return;
            }
            C15629h hVar2 = this.f148892d;
            if (hVar2 == null || !hVar2.isShowing()) {
                z = false;
            }
            if (z && this.f148898j != mo73931a()) {
                mo73932b();
            }
        }
    }
}
