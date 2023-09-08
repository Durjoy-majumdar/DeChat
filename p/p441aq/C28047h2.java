package p441aq;

import com.tencent.p014mm.autogen.events.GifErrorCodeEvent;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import fc0.C32005b;
import p008bq.C92281h1;

@C86522b
/* renamed from: aq.h2 */
public class C28047h2 extends C86301e implements C92281h1 {
    public void P90(MMGIFException mMGIFException) {
        GifErrorCodeEvent gifErrorCodeEvent = new GifErrorCodeEvent();
        gifErrorCodeEvent.f78829d.f78830a = mMGIFException.getErrorCode();
        gifErrorCodeEvent.publish();
    }

    public boolean ug0(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        MMHandler mMHandler = C32005b.f85212d;
        if (mMHandler == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(mMHandler != null);
            objArr[1] = Util.getStack();
            Log.m105929w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] stack[%s]", objArr);
            MMHandler mMHandler2 = C32005b.f85212d;
            if (mMHandler2 != null) {
                mMHandler2.removeCallbacksAndMessages((Object) null);
            }
            MMHandler mMHandler3 = new MMHandler("GIF-Decoder");
            C32005b.f85212d = mMHandler3;
            mMHandler3.setLogging(false);
        }
        if (j > 0) {
            C32005b.f85212d.postDelayed(runnable, j);
            return true;
        }
        C32005b.f85212d.post(runnable);
        return true;
    }
}
