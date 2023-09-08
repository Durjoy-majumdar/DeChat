package ts3;

import android.content.Context;
import java.util.ArrayList;
import s40.C118271b;
import us3.C118607a;
import ws3.C118784a;
import ws3.C118786c;

/* renamed from: ts3.c */
public class C118508c {

    /* renamed from: a */
    public static C118607a f354680a;

    /* renamed from: ts3.c$a */
    public interface C118509a {
    }

    /* renamed from: a */
    public static void m167173a(Context context, C118509a aVar) {
        if (f354680a == null) {
            f354680a = new C118607a(context);
        }
        C118607a aVar2 = f354680a;
        aVar2.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() != 0) {
                C118784a aVar3 = new C118784a();
                aVar3.f355375f = aVar2.mo183350b();
                C118786c cVar = new C118786c();
                aVar3.f355373d = cVar;
                cVar.f355401d = 6;
                cVar.f355402e = 1;
                cVar.f355403f = 0;
                cVar.f355404g = 0;
                cVar.f355405h = 0;
                cVar.f355406i = null;
                cVar.f355407j = 0;
                cVar.f355412r = 1;
                aVar3.f355374e = new ArrayList<>();
                for (int i = 0; i < arrayList.size(); i++) {
                    C118607a.m167294a(aVar2.f354929a, (C118506a) arrayList.get(i), i);
                    aVar3.f355374e.add((Object) null);
                }
                byte[] a = aVar2.f354930b.mo183351a(aVar3);
                if (a == null) {
                    if (aVar != null) {
                        ((C118271b) aVar).mo183054a(-20, (byte[]) null);
                    }
                } else if (aVar != null) {
                    ((C118271b) aVar).mo183054a(0, a);
                }
            } else if (aVar != null) {
                ((C118271b) aVar).mo183054a(-10, (byte[]) null);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                ((C118271b) aVar).mo183054a(-100, (byte[]) null);
            }
        }
    }
}
