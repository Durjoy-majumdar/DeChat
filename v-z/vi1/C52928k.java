package vi1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: vi1.k */
public final class C52928k<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C52931n f147777d;

    public C52928k(C52931n nVar) {
        this.f147777d = nVar;
    }

    public void onChanged(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Log.m105924i("MicIntercomPlugin", "micInterListLiveData: " + arrayList);
        if (arrayList.size() > 0) {
            this.f147777d.mo10792g(0);
        } else {
            this.f147777d.mo10792g(8);
        }
        this.f147777d.f147784r.mo71666a().postValue(arrayList);
    }
}
