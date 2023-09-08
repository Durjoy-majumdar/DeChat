package p965fe;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p329d3.C58104c;
import p961ee.C86507b;

/* renamed from: fe.c */
public class C86858c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f252144d;

    /* renamed from: e */
    public final /* synthetic */ C86853a f252145e;

    /* renamed from: fe.c$a */
    public class C86859a implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ List f252146a;

        /* renamed from: b */
        public final /* synthetic */ TextView f252147b;

        public C86859a(List list, TextView textView) {
            this.f252146a = list;
            this.f252147b = textView;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            if (!charSequence.contains(XVFSFile.PATH_SEPARATOR)) {
                return false;
            }
            String substring = charSequence.substring(charSequence.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1);
            for (C58104c<Integer, String> cVar : this.f252146a) {
                if (charSequence.equals("Process :" + C86853a.m107857d((String) cVar.f166180b))) {
                    C86858c.this.f252145e.f252124d = cVar;
                    TextView textView = this.f252147b;
                    textView.setText(XVFSFile.PATH_SEPARATOR + substring);
                    C86858c cVar2 = C86858c.this;
                    cVar2.f252144d.setText(String.valueOf(cVar2.f252145e.f252124d.f166179a));
                }
            }
            return false;
        }
    }

    /* renamed from: fe.c$b */
    public class C86860b implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: fe.c$b$a */
        public class C86861a implements Runnable {
            public C86861a() {
            }

            public void run() {
                C86858c.this.f252145e.mo121317c();
            }
        }

        public C86860b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            charSequence.getClass();
            if (charSequence.equals("Close")) {
                C86858c.this.f252145e.f252122b.postDelayed(new C86861a(), 200);
            } else if (charSequence.equals("Expand")) {
                View findViewById = C86858c.this.f252145e.f252125e.findViewById(C0966R.C0970id.m6h);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = C86858c.this.f252145e.f252125e.findViewById(C0966R.C0970id.m5k);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return false;
        }
    }

    public C86858c(C86853a aVar, TextView textView) {
        this.f252145e = aVar;
        this.f252144d = textView;
    }

    public void onClick(View view) {
        if (view.getId() == C0966R.C0970id.m5v) {
            C86853a aVar = this.f252145e;
            aVar.f252130j.accept(aVar.f252127g);
        } else if (view.getId() == C0966R.C0970id.m6f) {
            TextView textView = (TextView) this.f252145e.f252125e.findViewById(C0966R.C0970id.mi7);
            PopupMenu popupMenu = new PopupMenu(view.getContext(), textView);
            List<C58104c<Integer, String>> l = C86507b.m107281l(view.getContext());
            Iterator it = ((ArrayList) l).iterator();
            while (it.hasNext()) {
                Menu menu = popupMenu.getMenu();
                menu.add("Process :" + C86853a.m107857d((String) ((C58104c) it.next()).f166180b));
            }
            popupMenu.setOnMenuItemClickListener(new C86859a(l, textView));
            popupMenu.show();
        } else if (view.getId() == C0966R.C0970id.m5j) {
            this.f252145e.f252131k.run();
        } else if (view.getId() == C0966R.C0970id.mk_) {
            View findViewById = this.f252145e.f252125e.findViewById(C0966R.C0970id.m6h);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = this.f252145e.f252125e.findViewById(C0966R.C0970id.m5k);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view.getId() == C0966R.C0970id.f358516no3) {
            CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.nk9);
            checkBox.setChecked(!checkBox.isChecked());
            this.f252145e.f252128h = checkBox.isChecked();
        } else {
            View view4 = this.f252145e.f252125e;
            if (view == view4 && view4.findViewById(C0966R.C0970id.m6h).getVisibility() == 8) {
                PopupMenu popupMenu2 = new PopupMenu(view.getContext(), this.f252145e.f252125e.findViewById(C0966R.C0970id.m5k));
                popupMenu2.getMenu().add("Expand");
                popupMenu2.getMenu().add("Close");
                popupMenu2.setOnMenuItemClickListener(new C86860b());
                popupMenu2.show();
            }
        }
    }
}
