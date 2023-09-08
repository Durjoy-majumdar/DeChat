package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p427v4.media.MediaBrowserCompat;
import java.util.List;
import java.util.Objects;
import p385u2.C111105a;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C113018a extends MediaBrowserCompat.C112800c {

        /* renamed from: c */
        public final Context f338294c;

        /* renamed from: d */
        public final Intent f338295d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f338296e;

        /* renamed from: f */
        public MediaBrowserCompat f338297f;

        public C113018a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f338294c = context;
            this.f338295d = intent;
            this.f338296e = pendingResult;
        }

        /* renamed from: a */
        public final void mo165380a() {
            Messenger messenger;
            MediaBrowserCompat.C112804e eVar = (MediaBrowserCompat.C112804e) this.f338297f.f337755a;
            MediaBrowserCompat.C112808i iVar = eVar.f337768f;
            if (!(iVar == null || (messenger = eVar.f337769g) == null)) {
                try {
                    iVar.mo164583a(7, (Bundle) null, messenger);
                } catch (RemoteException unused) {
                }
            }
            eVar.f337764b.disconnect();
            this.f338296e.finish();
        }
    }

    /* renamed from: a */
    public static ComponentName m154634a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName a = m154634a(context, "android.intent.action.MEDIA_BUTTON");
        if (a != null) {
            intent.setComponent(a);
            Object obj = C111105a.f332697a;
            if (Build.VERSION.SDK_INT >= 26) {
                C111105a.C111107f.m151506a(context, intent);
            } else {
                context.startService(intent);
            }
        } else {
            ComponentName a2 = m154634a(context, "android.media.browse.MediaBrowserService");
            if (a2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C113018a aVar = new C113018a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, (Bundle) null);
                aVar.f338297f = mediaBrowserCompat;
                ((MediaBrowserCompat.C112804e) mediaBrowserCompat.f337755a).f337764b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }
}
