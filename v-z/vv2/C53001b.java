package vv2;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sport.model.C115769k;
import di3.C86312j;
import p248ug.C37468y;
import p248ug.C52558c;
import rb0.C47984k;

/* renamed from: vv2.b */
public class C53001b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52999a f147915d;

    public C53001b(C52999a aVar) {
        this.f147915d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C52558c b = C47984k.m53328b(this.f147915d.f147910e.getUsername());
        C52999a aVar = this.f147915d;
        ((C37468y) C86312j.m106911c(C37468y.class)).mo61116ee(b, (Activity) aVar.f147909d, aVar.f147910e, false);
        this.f147915d.mo73742a();
        C115769k.m162823b(false);
    }
}
