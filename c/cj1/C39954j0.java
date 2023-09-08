package cj1;

import al1.C0079b;
import cj1.C54820t;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Result;
import ok1.C62042e;
import p565ir.C60606n;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64338e71;
import wx3.C15601d;

/* renamed from: cj1.j0 */
public final class C39954j0 implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C54820t f107100a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C54820t.C39956a> f107101b;

    public C39954j0(C54820t tVar, C15601d<? super C54820t.C39956a> dVar) {
        this.f107100a = tVar;
        this.f107101b = dVar;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        C0079b bVar;
        C64338e71 e712;
        long j2 = j;
        Object obj2 = obj;
        Class cls = C55001u.class;
        String str = this.f107100a.f153694d;
        Log.m105924i(str, "getLiveInfo,liveData.business(LiveCommonSlice::class.java).liveId:" + ((C55001u) this.f107100a.mo75777m0(cls)).f154420q.f182392d + ",respLiveId:" + j2 + ",liveStatus:" + i + ",resp:" + obj2);
        boolean z = j2 == ((C55001u) this.f107100a.mo75777m0(cls)).f154420q.f182392d && (obj2 instanceof C51713vn0);
        if (z) {
            C54820t tVar = this.f107100a;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveInfoResp");
            C51713vn0 vn02 = (C51713vn0) obj2;
            tVar.getClass();
            C64273c21 c212 = vn02.f143572d;
            int i2 = (c212 != null ? c212.f182398j : 0) - (c212 != null ? c212.f182396h : 0);
            int i3 = c212 != null ? c212.f182393e : 0;
            long j3 = 0;
            long j4 = c212 != null ? c212.f182414z : 0;
            int i4 = vn02.f143573e;
            long m0 = C62042e.f176370a.mo87096m0(c212);
            C64273c21 c213 = vn02.f143572d;
            int i5 = c213 != null ? c213.f182372R : 0;
            int i6 = c213 != null ? c213.f182370Q : 0;
            if (c213 != null) {
                j3 = c213.f182377T0;
            }
            long j5 = j3;
            int i7 = vn02.f143576h;
            LinkedList<FinderJumpInfo> linkedList = vn02.f143578j;
            FinderJumpInfo finderJumpInfo = vn02.f143583r;
            int i8 = vn02.f143585t;
            int i9 = (c213 == null || (e712 = c213.f182388Z) == null) ? 0 : e712.f182931g;
            C87412m.m108593f(linkedList, "live_suggestion_jump");
            bVar = new C0079b(i2, i3, j4, i4, m0, i6, i5, j5, i7, linkedList, i8, finderJumpInfo, i9, vn02.f143587v);
        } else {
            bVar = null;
        }
        C0079b bVar2 = bVar;
        C15601d<C54820t.C39956a> dVar = this.f107101b;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(new C54820t.C39956a(z, 0, 0, "", bVar2)));
    }
}
