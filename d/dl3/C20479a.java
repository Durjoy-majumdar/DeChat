package dl3;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: dl3.a */
public final class C20479a extends UIComponent {

    /* renamed from: d */
    public final HashMap<String, LinkedList<C45413b>> f57582d = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20479a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onActivityResult : linkedList) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onBackPressed : linkedList) {
            if (onBackPressed.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    public void onBeforeFinish(Intent intent) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onBeforeFinish : linkedList) {
            onBeforeFinish.onBeforeFinish(intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onConfigurationChanged : linkedList) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public void onCreateAfter(Bundle bundle) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onCreateAfter : linkedList) {
            onCreateAfter.onCreateAfter(bundle);
        }
    }

    public void onCreateBefore(Bundle bundle) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onCreateBefore : linkedList) {
            onCreateBefore.onCreateBefore(bundle);
        }
    }

    public void onDestroy() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onDestroy : linkedList) {
            onDestroy.onDestroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onKeyDown : linkedList) {
            if (onKeyDown.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onKeyUp : linkedList) {
            if (onKeyUp.onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onNewIntent : linkedList) {
            onNewIntent.onNewIntent(intent);
        }
    }

    public void onPause() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onPause : linkedList) {
            onPause.onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onRequestPermissionsResult : linkedList) {
            onRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onRestoreInstanceState : linkedList) {
            onRestoreInstanceState.onRestoreInstanceState(bundle);
        }
    }

    public void onResume() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onResume : linkedList) {
            onResume.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onSaveInstanceState : linkedList) {
            onSaveInstanceState.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onStart : linkedList) {
            onStart.onStart();
        }
    }

    public void onStop() {
        LinkedList<C45413b> linkedList = new LinkedList<>();
        Collection<LinkedList<C45413b>> values = this.f57582d.values();
        C87412m.m108593f(values, "gloComMap.values");
        for (LinkedList addAll : values) {
            linkedList.addAll(addAll);
        }
        for (C45413b onStop : linkedList) {
            onStop.onStop();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20479a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
