package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p584k4.C108881b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C108881b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f306346a;
        if (bVar.mo160003i(1)) {
            obj = bVar.mo160009o();
        }
        remoteActionCompat.f306346a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f306347b;
        if (bVar.mo160003i(2)) {
            charSequence = bVar.mo160002h();
        }
        remoteActionCompat.f306347b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f306348c;
        if (bVar.mo160003i(3)) {
            charSequence2 = bVar.mo160002h();
        }
        remoteActionCompat.f306348c = charSequence2;
        remoteActionCompat.f306349d = (PendingIntent) bVar.mo160007m(remoteActionCompat.f306349d, 4);
        boolean z = remoteActionCompat.f306350e;
        if (bVar.mo160003i(5)) {
            z = bVar.mo160000f();
        }
        remoteActionCompat.f306350e = z;
        boolean z2 = remoteActionCompat.f306351f;
        if (bVar.mo160003i(6)) {
            z2 = bVar.mo160000f();
        }
        remoteActionCompat.f306351f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C108881b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f306346a;
        bVar.mo160010p(1);
        bVar.mo160018x(iconCompat);
        CharSequence charSequence = remoteActionCompat.f306347b;
        bVar.mo160010p(2);
        bVar.mo160013s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f306348c;
        bVar.mo160010p(3);
        bVar.mo160013s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f306349d;
        bVar.mo160010p(4);
        bVar.mo160016v(pendingIntent);
        boolean z = remoteActionCompat.f306350e;
        bVar.mo160010p(5);
        bVar.mo160011q(z);
        boolean z2 = remoteActionCompat.f306351f;
        bVar.mo160010p(6);
        bVar.mo160011q(z2);
    }
}
