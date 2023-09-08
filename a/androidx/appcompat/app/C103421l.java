package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* renamed from: androidx.appcompat.app.l */
public class C103421l extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl.C103405f f305078a;

    public C103421l(AppCompatDelegateImpl.C103405f fVar) {
        this.f305078a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        AppCompatDelegateImpl.C103405f fVar = this.f305078a;
        boolean a = fVar.f305056a.mo164690a();
        if (a != fVar.f305057b) {
            fVar.f305057b = a;
            AppCompatDelegateImpl.this.mo143383a();
        }
    }
}
