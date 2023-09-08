package m23;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import i72.C98606a;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import p914oj.C110052b;
import pe3.C89349b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.caption.EditCaptionDataManager$voiceTransLate$1", mo125469f = "EditCaptionDataManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: m23.a */
public final class C61434a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C61435b f174675d;

    /* renamed from: e */
    public final /* synthetic */ int f174676e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61434a(C61435b bVar, int i, C15601d<? super C61434a> dVar) {
        super(2, dVar);
        this.f174675d = bVar;
        this.f174676e = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61434a(this.f174675d, this.f174676e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61434a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C61435b bVar = this.f174675d;
        if (!bVar.f174685n) {
            long currentTicks = Util.currentTicks();
            ByteBuffer byteBuffer = bVar.f174682h;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            ByteBuffer byteBuffer2 = bVar.f174682h;
            if (byteBuffer2 != null) {
                byteBuffer2.position(0);
            }
            while (!bVar.f174692u && (r0 = bVar.f174680f) != null && r0.mo161384c() >= 0) {
                try {
                    ByteBuffer byteBuffer3 = bVar.f174682h;
                    if (byteBuffer3 != null) {
                        C110052b bVar2 = bVar.f174680f;
                        int f = bVar2 != null ? bVar2.mo161387f(byteBuffer3, bVar.f174684j + 7) : -1;
                        if (f > 2) {
                            int i = f + 7;
                            C98606a.m128204a(byteBuffer3, bVar.f174684j, i, bVar.f174689r, bVar.f174690s, bVar.f174691t);
                            bVar.f174684j += i;
                        }
                        C110052b bVar3 = bVar.f174680f;
                        if (bVar3 != null) {
                            bVar3.mo161382a();
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EditCaptionDataManager", e, "loadAudioTrackData error:" + e.getMessage(), new Object[0]);
                }
            }
            Log.m105924i("MicroMsg.EditCaptionDataManager", '[' + bVar.hashCode() + "]load audio track size:" + bVar.f174684j + " cost:" + Util.ticksToNow(currentTicks));
            bVar.f174685n = true;
        }
        C61435b bVar4 = this.f174675d;
        int i2 = this.f174676e;
        bVar4.getClass();
        long currentTicks2 = Util.currentTicks();
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int i5 = bVar4.f174684j;
            if (i3 >= i5) {
                break;
            }
            int i6 = 167116 + i3;
            if (i6 <= i5) {
                i5 = i6;
            }
            ByteBuffer byteBuffer4 = bVar4.f174682h;
            if (byteBuffer4 != null) {
                byteBuffer4.position(i3);
            }
            int i7 = i5 - i3;
            byte[] bArr = new byte[i7];
            ByteBuffer byteBuffer5 = bVar4.f174682h;
            if (byteBuffer5 != null) {
                byteBuffer5.get(bArr);
            }
            bVar4.mo86404a(i2, new C89349b(bArr, 0, i7), i4, i3);
            i4++;
            i3 = i5;
        }
        Log.m105924i("MicroMsg.EditCaptionDataManager", '[' + bVar4.hashCode() + "]do net cost:" + Util.ticksToNow(currentTicks2));
        ByteBuffer byteBuffer6 = bVar4.f174682h;
        if (byteBuffer6 != null) {
            byteBuffer6.clear();
        }
        return C13598b0.f38549a;
    }
}
