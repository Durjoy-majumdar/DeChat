package androidx.core.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C112980e0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import p1042u.C111059i;
import p849e3.C107177e;

public class ComponentActivity extends HellActivity implements C0125s, C107177e.C107178a {
    private C111059i<Class<? extends C79596a>, C79596a> mExtraDataMap = new C111059i<>();
    private C103766u mLifecycleRegistry = new C103766u(this);

    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C79596a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C107177e.m145059a(decorView, keyEvent)) {
            return C107177e.m145060b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C107177e.m145059a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C79596a> T getExtraData(Class<T> cls) {
        return (C79596a) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public C39623j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C112980e0.m154618c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo145136d(C39623j.C39626c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C79596a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
