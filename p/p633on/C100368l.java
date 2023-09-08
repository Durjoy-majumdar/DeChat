package p633on;

import android.graphics.Bitmap;
import aw0.C103925l;
import aw0.C92161k;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p391w3.C22857b;
import p646pn.C100824i;

@C86522b
/* renamed from: on.l */
public class C100368l extends C86301e implements C100824i {
    /* renamed from: DS */
    public void mo139641DS(Bitmap bitmap, int i, C100824i.C100825a aVar) {
        Boolean bool = C103925l.f307288a;
        if (aVar != null) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105924i("MicroMsg.FloatBallUtil", "getPrimaryColor, bitmap is null");
                aVar.mo23027a(i);
                return;
            }
            new C22857b.C22859b(bitmap).mo36018a(new C92161k(aVar, i));
        }
    }

    public int g30(int i, int i2) {
        Boolean bool = C103925l.f307288a;
        return i & (~i2);
    }

    /* renamed from: js */
    public boolean mo139643js(BallInfo ballInfo) {
        return C103925l.m138640n(ballInfo);
    }

    /* renamed from: ye */
    public int mo139644ye(int i, int i2) {
        Boolean bool = C103925l.f307288a;
        return i | i2;
    }
}
