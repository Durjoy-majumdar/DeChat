package p819pc;

import android.content.Context;
import android.view.MenuItem;
import nj3.C11184p0;
import p1044ub.C90630c;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: pc.b */
public final class C89332b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f257302d;

    /* renamed from: e */
    public final /* synthetic */ Context f257303e;

    /* renamed from: f */
    public final /* synthetic */ C90630c f257304f;

    /* renamed from: pc.b$a */
    public static final class C89333a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f257305d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f257306e;

        public C89333a(Context context, C90630c cVar) {
            this.f257305d = context;
            this.f257306e = cVar;
        }

        public final void run() {
            C76701a.makeText(this.f257305d, (CharSequence) "renderer: webview", 0).show();
            this.f257306e.getRuntime().mo113006E();
        }
    }

    /* renamed from: pc.b$b */
    public static final class C89334b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f257307d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f257308e;

        public C89334b(Context context, C90630c cVar) {
            this.f257307d = context;
            this.f257308e = cVar;
        }

        public final void run() {
            C76701a.makeText(this.f257307d, (CharSequence) "renderer: skyline", 0).show();
            this.f257308e.getRuntime().mo113006E();
        }
    }

    /* renamed from: pc.b$c */
    public static final class C89335c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f257309d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f257310e;

        public C89335c(Context context, C90630c cVar) {
            this.f257309d = context;
            this.f257310e = cVar;
        }

        public final void run() {
            C76701a.makeText(this.f257309d, (CharSequence) "renderer: auto", 0).show();
            this.f257310e.getRuntime().mo113006E();
        }
    }

    /* renamed from: pc.b$d */
    public static final class C89336d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f257311d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f257312e;

        public C89336d(Context context, C90630c cVar) {
            this.f257311d = context;
            this.f257312e = cVar;
        }

        public final void run() {
            C76701a.makeText(this.f257311d, (CharSequence) "renderer: auto", 0).show();
            this.f257312e.getRuntime().mo113006E();
        }
    }

    public C89332b(String str, Context context, C90630c cVar) {
        this.f257302d = str;
        this.f257303e = context;
        this.f257304f = cVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C47454d.f127280a.mo72475b(this.f257302d, 0);
            ((C119157j) C119157j.f356862d).mo183895z(new C89335c(this.f257303e, this.f257304f));
        } else if (itemId == 1) {
            C47454d.f127280a.mo72475b(this.f257302d, 1);
            ((C119157j) C119157j.f356862d).mo183895z(new C89333a(this.f257303e, this.f257304f));
        } else if (itemId != 2) {
            C47454d.f127280a.mo72475b(this.f257302d, 0);
            ((C119157j) C119157j.f356862d).mo183895z(new C89336d(this.f257303e, this.f257304f));
        } else {
            C47454d.f127280a.mo72475b(this.f257302d, 2);
            ((C119157j) C119157j.f356862d).mo183895z(new C89334b(this.f257303e, this.f257304f));
        }
    }
}
