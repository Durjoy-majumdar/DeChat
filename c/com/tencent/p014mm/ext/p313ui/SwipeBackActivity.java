package com.tencent.p014mm.ext.p313ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.ext.p313ui.C104623b;
import com.tencent.p014mm.ext.p313ui.C114718c;
import com.tencent.p014mm.ext.p313ui.SwipeBackLayout;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import p1005ma.C88718b;
import p1056vl.C90824b;

/* renamed from: com.tencent.mm.ext.ui.SwipeBackActivity */
public class SwipeBackActivity extends AppCompatActivity implements C114718c.C114719a, SwipeBackLayout.C17731b {

    /* renamed from: d */
    public SwipeBackLayout f343911d;

    /* renamed from: e */
    public View f343912e = null;

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SwipeBackLayout swipeBackLayout = this.f343911d;
        if (keyEvent.getKeyCode() == 4 && swipeBackLayout != null) {
            if (swipeBackLayout.f48807w && Float.compare((float) swipeBackLayout.f48797j.getLeft(), 0.01f) <= 0) {
                swipeBackLayout.f48807w = false;
            }
            if (swipeBackLayout.f48807w) {
                C88718b.m110682d("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event", new Object[0]);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        SwipeBackLayout swipeBackLayout = this.f343911d;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        if (!isFinishing()) {
            C88718b.m110679a("MicroMsg.LiteAppSwipeBackHelper", "pushCallback size %d, %s", Integer.valueOf(C114718c.f343914b.size()), this);
            C114718c.f343914b.add(0, new WeakReference(this));
        }
    }

    public void onResume() {
        super.onResume();
        int size = C114718c.f343914b.size();
        C88718b.m110679a("MicroMsg.LiteAppSwipeBackHelper", "popCallback size %d, %s", Integer.valueOf(size), this);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (true) {
            if (i >= C114718c.f343914b.size()) {
                break;
            } else if (this == C114718c.f343914b.get(i).get()) {
                C114718c.f343914b.remove(i);
                C88718b.m110679a("MicroMsg.LiteAppSwipeBackHelper", "popCallback directly, index %d", Integer.valueOf(i));
                break;
            } else {
                linkedList.add(0, Integer.valueOf(i));
                i++;
            }
        }
        if (linkedList.size() == size) {
            C88718b.m110679a("MicroMsg.LiteAppSwipeBackHelper", "popCallback Fail! Maybe Top Activity", new Object[0]);
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                WeakReference remove = C114718c.f343914b.remove(((Integer) it.next()).intValue());
                Object[] objArr = new Object[1];
                objArr[0] = remove != null ? remove.get() : "NULL-CALLBACK";
                C88718b.m110679a("MicroMsg.LiteAppSwipeBackHelper", "popCallback, popup %s", objArr);
            }
            linkedList.isEmpty();
        }
        onSwipe(1.0f);
        SwipeBackLayout swipeBackLayout = this.f343911d;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(true);
            this.f343911d.f48807w = false;
        }
    }

    public void onSettle(boolean z, int i) {
        if (this.f343912e == null) {
            this.f343912e = C90824b.m113901a(getWindow(), getSupportActionBar().mo91099j());
        }
        View view = this.f343912e;
        long j = 130;
        if (z) {
            if (i <= 0) {
                j = 260;
            }
            C104623b.m140236a(view, j, 0.0f, 0.0f, (C104623b.C104625b) null);
            return;
        }
        if (i <= 0) {
            j = 260;
        }
        C104623b.m140236a(view, j, ((float) (view.getWidth() * -1)) / 3.5f, 0.0f, (C104623b.C104625b) null);
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void onSwipe(float f) {
        if (this.f343912e == null) {
            this.f343912e = C90824b.m113901a(getWindow(), getSupportActionBar() != null ? getSupportActionBar().mo91099j() : null);
        }
        View view = this.f343912e;
        if (Float.compare(1.0f, f) <= 0) {
            C104623b.m140237b(view, 0.0f, 0.0f);
        } else {
            C104623b.m140237b(view, (((float) view.getWidth()) / 3.5f) * (1.0f - f) * -1.0f, 0.0f);
        }
    }

    public void onSwipeBack() {
        if (!isFinishing()) {
            finish();
        }
        View decorView = getWindow().getDecorView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(decorView, aVar.mo10232b(), "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(decorView, "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
    }
}
