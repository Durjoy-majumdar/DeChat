package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C67073a;
import androidx.activity.result.IntentSenderRequest;
import java.util.HashMap;
import p431e.C116634a;
import p918s2.C118252b;
import p918s2.C90111a;

public class ComponentActivity$$e extends ActivityResultRegistry {

    /* renamed from: i */
    public final /* synthetic */ ComponentActivity f337824i;

    /* renamed from: androidx.activity.ComponentActivity$$e$a */
    public class C112838a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f337825d;

        /* renamed from: e */
        public final /* synthetic */ C116634a.C116635a f337826e;

        public C112838a(int i, C116634a.C116635a aVar) {
            this.f337825d = i;
            this.f337826e = aVar;
        }

        public void run() {
            C67073a<O> aVar;
            ComponentActivity$$e componentActivity$$e = ComponentActivity$$e.this;
            int i = this.f337825d;
            T t = this.f337826e.f349734a;
            String str = (String) ((HashMap) componentActivity$$e.f337844b).get(Integer.valueOf(i));
            if (str != null) {
                ActivityResultRegistry.C112847c cVar = (ActivityResultRegistry.C112847c) ((HashMap) componentActivity$$e.f337848f).get(str);
                if (cVar == null || (aVar = cVar.f337861a) == null) {
                    componentActivity$$e.f337850h.remove(str);
                    ((HashMap) componentActivity$$e.f337849g).put(str, t);
                } else if (componentActivity$$e.f337847e.remove(str)) {
                    aVar.mo91080a(t);
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$$e$b */
    public class C112839b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f337828d;

        /* renamed from: e */
        public final /* synthetic */ IntentSender.SendIntentException f337829e;

        public C112839b(int i, IntentSender.SendIntentException sendIntentException) {
            this.f337828d = i;
            this.f337829e = sendIntentException;
        }

        public void run() {
            ComponentActivity$$e.this.mo164679a(this.f337828d, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f337829e));
        }
    }

    public ComponentActivity$$e(ComponentActivity componentActivity) {
        this.f337824i = componentActivity;
    }

    /* renamed from: b */
    public <I, O> void mo164663b(int i, C116634a<I, O> aVar, I i2, C118252b bVar) {
        ComponentActivity componentActivity = this.f337824i;
        C116634a.C116635a<O> b = aVar.mo180636b(componentActivity, i2);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new C112838a(i, b));
            return;
        }
        Intent a = aVar.mo105808a(componentActivity, i2);
        Bundle bundle = null;
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (bVar != null) {
            bundle = bVar.mo183044b();
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C90111a.m112741e(componentActivity, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f337865d;
                Intent intent = intentSenderRequest.f337866e;
                int i3 = intentSenderRequest.f337867f;
                int i4 = intentSenderRequest.f337868g;
                int i5 = C90111a.f258766c;
                componentActivity.startIntentSenderForResult(intentSender, i, intent, i3, i4, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new C112839b(i, e));
            }
        } else {
            int i6 = C90111a.f258766c;
            componentActivity.startActivityForResult(a, i, bundle2);
        }
    }
}
