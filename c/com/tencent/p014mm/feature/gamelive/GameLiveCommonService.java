package com.tencent.p014mm.feature.gamelive;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p565ir.C60606n;
import p635os.C89291d;
import q20.C89449a;
import rx3.C13601g;
import rx3.C36568h;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService */
public final class GameLiveCommonService extends C86301e implements C89291d {

    /* renamed from: g */
    public static final MultiProcessMMKV f237640g = MultiProcessMMKV.getMMKV("PluginGameLive");

    /* renamed from: d */
    public final C13601g f237641d = C36568h.m40985a(C28915d.f79338d);

    /* renamed from: e */
    public boolean f237642e;

    /* renamed from: f */
    public boolean f237643f;

    /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$d */
    public static final class C28915d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C28915d f79338d = new C28915d();

        public C28915d() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (BuildInfo.DEBUG && MMApplicationContext.getDefaultPreference().getBoolean("GAME_LIVE_AUDIO_DEBUG", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$a */
    public enum C80853a {
        GameLiveState_NotInited(0),
        GameLiveState_PrePare(1),
        GameLiveState_LivingForeGround(2),
        GameLiveState_LivingBackGround(3),
        GameLiveState_Destroy(4);
        

        /* renamed from: d */
        public final int f237683d;

        /* access modifiers changed from: public */
        C80853a(int i) {
            this.f237683d = i;
        }

        /* renamed from: a */
        public final String mo112614a() {
            int i = this.f237683d;
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "GameLiveState_Destroy" : "GameLiveState_LivingBackGround" : "GameLiveState_LivingForeGround" : "GameLiveState_PrePare" : "GameLiveState_NotInited";
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/feature/gamelive/GameLiveCommonService$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/feature/gamelive/GameLiveCommonService$IPCLiveControlData;", "<init>", "()V", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$b */
    public static final class C80854b implements C80883e<IPCLiveControlData, IPCLiveControlData> {
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x05ee, code lost:
            if (r7 > 1.0f) goto L_0x05f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x05f5, code lost:
            if (r7 > 1.0f) goto L_0x05f9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r18, com.tencent.p014mm.ipcinvoker.C1256g r19) {
            /*
                r17 = this;
                r0 = r19
                java.lang.Class<ir.n> r1 = p565ir.C60606n.class
                r2 = r18
                com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData r2 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService.IPCLiveControlData) r2
                java.lang.Class<lz1.j> r3 = lz1.C88684j.class
                java.lang.Class<com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService> r4 = com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.class
                java.lang.Class<mz1.h> r5 = mz1.C88864h.class
                java.lang.Class<kz1.h> r6 = kz1.C88341h.class
                if (r2 != 0) goto L_0x001b
                java.lang.String r0 = "MicroMsg.PluginGameLive"
                java.lang.String r1 = "data is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                goto L_0x07ff
            L_0x001b:
                com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b r7 = r2.f237644d
                int r7 = r7.ordinal()
                java.lang.String r8 = "sourceid"
                java.lang.String r9 = "appid"
                java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LivePlayGamePayLoad"
                java.lang.String r11 = "GameLiveAppbrandEventService"
                java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.SimpleLiveStateChangePayload"
                java.lang.String r13 = "MicroMsg.GameLiveMainAudioMgrService"
                java.lang.String r14 = "MicroMsg.GameLiveMainRenderMgrService"
                java.lang.String r15 = "MicroMsg.GameLiveMainProcessService"
                r18 = r14
                java.lang.String r14 = "MicroMsg.GameLiveRenderManager"
                r16 = r14
                r14 = 1
                switch(r7) {
                    case 1: goto L_0x07f4;
                    case 2: goto L_0x079a;
                    case 3: goto L_0x074c;
                    case 4: goto L_0x0734;
                    case 5: goto L_0x071b;
                    case 6: goto L_0x06e7;
                    case 7: goto L_0x06a6;
                    case 8: goto L_0x05b8;
                    case 9: goto L_0x059a;
                    case 10: goto L_0x0527;
                    case 11: goto L_0x04e1;
                    case 12: goto L_0x049e;
                    case 13: goto L_0x0488;
                    case 14: goto L_0x0472;
                    case 15: goto L_0x0453;
                    case 16: goto L_0x043a;
                    case 17: goto L_0x03d5;
                    case 18: goto L_0x039e;
                    case 19: goto L_0x0375;
                    case 20: goto L_0x0348;
                    case 21: goto L_0x030f;
                    case 22: goto L_0x030f;
                    case 23: goto L_0x02fa;
                    case 24: goto L_0x029c;
                    case 25: goto L_0x0127;
                    case 26: goto L_0x00ae;
                    case 27: goto L_0x003e;
                    default: goto L_0x003c;
                }
            L_0x003c:
                goto L_0x07ff
            L_0x003e:
                android.os.Parcelable r0 = r2.f237647g
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveNetWorkPayload"
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveNetWorkPayload) r0
                di3.d r1 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r1 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r1
                int r2 = r0.f248285d
                int r0 = r0.f248286e
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService r1 = r1.f248206e
                if (r1 == 0) goto L_0x07ff
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.f248277a
                if (r1 == 0) goto L_0x07ff
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$c r3 = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$c
                r3.<init>()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "send LiveNetWork event,quality:"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r5 = ",threshold:"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
                com.tencent.mm.plugin.appbrand.i2 r1 = r1.f238150p
                kr0.e r1 = (kr0.C88267e) r1
                r3.mo115194p(r1)
                r1 = 2
                rx3.l[] r1 = new rx3.C13604l[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                rx3.l r4 = new rx3.l
                java.lang.String r5 = "quality"
                r4.<init>(r5, r2)
                r2 = 0
                r1[r2] = r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                rx3.l r2 = new rx3.l
                java.lang.String r4 = "threshold"
                r2.<init>(r4, r0)
                r1[r14] = r2
                java.util.Map r0 = sx3.C90364q0.m113147f(r1)
                r3.mo115165o(r0)
                r3.mo115158h()
                goto L_0x07ff
            L_0x00ae:
                android.os.Parcelable r0 = r2.f237647g
                gy3.C87412m.m108592e(r0, r12)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.SimpleLiveStateChangePayload) r0
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f19362d
                java.lang.String r1 = "micVolume"
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x07ff
                int r0 = r0.intValue()
                di3.d r2 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r2 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r2
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService r3 = r2.f248206e
                if (r3 == 0) goto L_0x07ff
                boolean r2 = r2.f248208g
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.f248277a
                if (r3 == 0) goto L_0x07ff
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$b r4 = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$b
                r4.<init>()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "send LiveMute event with volumn,mute:"
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = ",micVolume: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
                com.tencent.mm.plugin.appbrand.i2 r3 = r3.f238150p
                kr0.e r3 = (kr0.C88267e) r3
                r4.mo115194p(r3)
                r3 = 2
                rx3.l[] r3 = new rx3.C13604l[r3]
                r2 = r2 ^ r14
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                rx3.l r5 = new rx3.l
                java.lang.String r6 = "mute"
                r5.<init>(r6, r2)
                r2 = 0
                r3[r2] = r5
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                rx3.l r2 = new rx3.l
                r2.<init>(r1, r0)
                r3[r14] = r2
                java.util.Map r0 = sx3.C90364q0.m113147f(r3)
                r4.mo115165o(r0)
                r4.mo115158h()
                goto L_0x07ff
            L_0x0127:
                android.os.Parcelable r0 = r2.f237647g
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCommentWrapperInfoPayload"
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCommentWrapperInfoPayload) r0
                di3.d r1 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r1 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r1
                r1.getClass()
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService r1 = r1.f248206e
                if (r1 == 0) goto L_0x07ff
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.f248277a
                if (r1 == 0) goto L_0x07ff
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$a r2 = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$a
                r2.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload> r4 = r0.f81438i
                if (r4 == 0) goto L_0x0157
                int r4 = r4.size()
                if (r4 != 0) goto L_0x0157
                r4 = 1
                goto L_0x0158
            L_0x0157:
                r4 = 0
            L_0x0158:
                r5 = 3
                r6 = 4
                r7 = 6
                r8 = 5
                if (r4 != 0) goto L_0x021b
                java.util.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload> r4 = r0.f81438i
                gy3.C87412m.m108591d(r4)
                java.util.Iterator r4 = r4.iterator()
            L_0x0167:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x021b
                java.lang.Object r9 = r4.next()
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload r9 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveSingleCommentPayload) r9
                r10 = 12
                rx3.l[] r10 = new rx3.C13604l[r10]
                java.lang.Integer r12 = r9.f81441d
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "msgType"
                r13.<init>(r15, r12)
                r12 = 0
                r10[r12] = r13
                java.lang.String r12 = r9.f81442e
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "senderNickName"
                r13.<init>(r15, r12)
                r10[r14] = r13
                java.lang.String r12 = r9.f81443f
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "senderHeadImgUrl"
                r13.<init>(r15, r12)
                r12 = 2
                r10[r12] = r13
                java.lang.String r12 = r9.f81444g
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "content"
                r13.<init>(r15, r12)
                r10[r5] = r13
                java.lang.Integer r12 = r9.f81445h
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "msgCreateTime"
                r13.<init>(r15, r12)
                r10[r6] = r13
                java.lang.Long r12 = r9.f81446i
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "msgSeq"
                r13.<init>(r15, r12)
                r10[r8] = r13
                java.lang.Integer r12 = r9.f81447j
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "comboRewardCount"
                r13.<init>(r15, r12)
                r10[r7] = r13
                r12 = 7
                java.lang.Integer r13 = r9.f81448n
                rx3.l r15 = new rx3.l
                java.lang.String r8 = "rankingPosition"
                r15.<init>(r8, r13)
                r10[r12] = r15
                r8 = 8
                java.lang.String r12 = r9.f81449o
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "rewardProduectId"
                r13.<init>(r15, r12)
                r10[r8] = r13
                r8 = 9
                java.lang.String r12 = r9.f81450p
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "rewardThumbUrl"
                r13.<init>(r15, r12)
                r10[r8] = r13
                r8 = 10
                java.lang.String r12 = r9.f81451q
                rx3.l r13 = new rx3.l
                java.lang.String r15 = "rewardName"
                r13.<init>(r15, r12)
                r10[r8] = r13
                r8 = 11
                int r9 = r9.f81452r
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                rx3.l r12 = new rx3.l
                java.lang.String r13 = "rewardAmount"
                r12.<init>(r13, r9)
                r10[r8] = r12
                java.util.Map r8 = sx3.C90364q0.m113147f(r10)
                r3.add(r8)
                r8 = 5
                goto L_0x0167
            L_0x021b:
                rx3.l[] r4 = new rx3.C13604l[r7]
                long r7 = r0.f81433d
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                rx3.l r8 = new rx3.l
                java.lang.String r9 = "liveId"
                r8.<init>(r9, r7)
                r7 = 0
                r4[r7] = r8
                long r7 = r0.f81434e
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                rx3.l r8 = new rx3.l
                java.lang.String r9 = "currOnlineCount"
                r8.<init>(r9, r7)
                r4[r14] = r8
                long r7 = r0.f81435f
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                rx3.l r8 = new rx3.l
                java.lang.String r9 = "totalViewCount"
                r8.<init>(r9, r7)
                r7 = 2
                r4[r7] = r8
                long r7 = r0.f81436g
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                rx3.l r8 = new rx3.l
                java.lang.String r9 = "currLikeCount"
                r8.<init>(r9, r7)
                r4[r5] = r8
                long r7 = r0.f81437h
                java.lang.Long r0 = java.lang.Long.valueOf(r7)
                rx3.l r5 = new rx3.l
                java.lang.String r7 = "totalRewardCount"
                r5.<init>(r7, r0)
                r4[r6] = r5
                rx3.l r0 = new rx3.l
                java.lang.String r5 = "msgList"
                r0.<init>(r5, r3)
                r5 = 5
                r4[r5] = r0
                java.util.Map r0 = sx3.C90364q0.m113147f(r4)
                java.lang.Object[] r4 = new java.lang.Object[r14]
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 0
                r4[r5] = r3
                java.lang.String r3 = "send LiveComment event,info list size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r4)
                com.tencent.mm.plugin.appbrand.i2 r1 = r1.f238150p
                kr0.e r1 = (kr0.C88267e) r1
                r2.mo115194p(r1)
                r2.mo115165o(r0)
                r2.mo115158h()
                goto L_0x07ff
            L_0x029c:
                android.os.Parcelable r0 = r2.f237647g
                gy3.C87412m.m108592e(r0, r12)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.SimpleLiveStateChangePayload) r0
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.f19362d
                java.lang.String r2 = "shareUserCount"
                java.lang.Object r1 = r1.get(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x07ff
                int r1 = r1.intValue()
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f19362d
                java.lang.String r2 = "shareRoomCount"
                java.lang.Object r0 = r0.get(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x07ff
                int r0 = r0.intValue()
                di3.d r2 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r2 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r2
                kz1.l$f r2 = r2.f248211j
                if (r2 == 0) goto L_0x07ff
                hl0.h r2 = (hl0.C87550h) r2
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r4 = "singleChat"
                r3.put(r4, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "groupChat"
                r3.put(r1, r0)
                kr0.e r0 = r2.f253638a
                int r1 = r2.f253639b
                hl0.i r2 = r2.f253640c
                java.lang.String r4 = "ok"
                java.lang.String r2 = r2.mo115112m(r4, r3)
                r0.mo109647a(r1, r2)
                goto L_0x07ff
            L_0x02fa:
                di3.d r0 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r0 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r0
                r0.f248208g = r14
                di3.d r0 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r0 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r0
                r1 = 0
                r2 = 0
                r0.wx0(r14, r1, r2)
                goto L_0x07ff
            L_0x030f:
                android.os.Parcelable r0 = r2.f237647g
                gy3.C87412m.m108592e(r0, r12)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.SimpleLiveStateChangePayload) r0
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.f19362d
                java.lang.String r2 = "event"
                java.lang.Object r1 = r1.get(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x07ff
                int r1 = r1.intValue()
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f19362d
                java.lang.String r2 = "reason"
                java.lang.Object r0 = r0.get(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x07ff
                int r0 = r0.intValue()
                di3.d r2 = di3.C86312j.m106911c(r4)
                java.lang.String r3 = "getService(GameLiveAppbr…ocessService::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService r2 = (com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService) r2
                r3 = 0
                r2.wx0(r1, r0, r3)
                goto L_0x07ff
            L_0x0348:
                android.os.Parcelable r0 = r2.f237647g
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.AnchorLiveEntrance"
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.AnchorLiveEntrance) r0
                di3.d r1 = di3.C86312j.m106911c(r6)
                kz1.h r1 = (kz1.C88341h) r1
                int r3 = r0.f248278d
                int r4 = r0.f248279e
                long r5 = r0.f248280f
                r1.getClass()
                java.lang.Class<ht1.e4> r0 = ht1.C60165e4.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(\n            …ice::class.java\n        )"
                gy3.C87412m.m108593f(r0, r1)
                r2 = r0
                ht1.e4 r2 = (ht1.C60165e4) r2
                sx3.g0 r7 = sx3.C36903g0.f97931d
                r2.mo85147I3(r3, r4, r5, r7)
                goto L_0x07ff
            L_0x0375:
                di3.d r3 = di3.C86312j.m106911c(r6)
                kz1.h r3 = (kz1.C88341h) r3
                android.os.Parcelable r2 = r2.f237647g
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveTopicPayload"
                gy3.C87412m.m108592e(r2, r4)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload r2 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveTopicPayload) r2
                com.tencent.mm.feature.gamelive.c r4 = new com.tencent.mm.feature.gamelive.c
                r4.<init>(r0)
                r3.getClass()
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                java.lang.String r1 = r2.f248297d
                kz1.j r2 = new kz1.j
                r2.<init>(r4)
                r0.mo85086sb(r1, r2)
                goto L_0x07ff
            L_0x039e:
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                android.os.Parcelable r2 = r2.f237647g
                gy3.C87412m.m108592e(r2, r10)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad r2 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LivePlayGamePayLoad) r2
                r0.getClass()
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r3 = r2.f248292i
                r0.put(r9, r3)
                int r3 = r2.f248295o
                r0.put(r8, r3)
                int r2 = r2.f248296p
                java.lang.String r3 = "type"
                r0.put(r3, r2)
                java.lang.String r2 = "gametype"
                r0.put(r2, r14)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                r1.Dc0(r0)
                goto L_0x07ff
            L_0x03d5:
                android.os.Parcelable r2 = r2.f237647g
                gy3.C87412m.m108592e(r2, r10)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad r2 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LivePlayGamePayLoad) r2
                di3.d r3 = di3.C86312j.m106911c(r6)
                kz1.h r3 = (kz1.C88341h) r3
                com.tencent.mm.feature.gamelive.b r4 = new com.tencent.mm.feature.gamelive.b
                r4.<init>(r0)
                r3.getClass()
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                int r3 = r2.f248287d
                java.lang.String r5 = "join_team_mode"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248288e
                java.lang.String r5 = "title"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248289f
                java.lang.String r5 = "teamup_desc"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248290g
                java.lang.String r5 = "member_desc"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248291h
                java.lang.String r5 = "teamup_extra_data"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248292i
                r0.put(r9, r3)
                int r3 = r2.f248293j
                java.lang.String r5 = "versionType"
                r0.put(r5, r3)
                java.lang.String r3 = r2.f248294n
                java.lang.String r5 = "path"
                r0.put(r5, r3)
                int r2 = r2.f248295o
                r0.put(r8, r2)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                r1.Kb0(r0, r4)
                goto L_0x07ff
            L_0x043a:
                di3.d r1 = di3.C86312j.m106911c(r3)
                lz1.j r1 = (lz1.C88684j) r1
                r1.getClass()
                java.lang.String r2 = "try reconnect"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
                r1.f256036e = r14
                if (r0 == 0) goto L_0x07ff
                r1 = 0
                r0.mo894a(r1)
                goto L_0x07ff
            L_0x0453:
                android.os.Parcelable r0 = r2.f237647g
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveIntPayload"
                gy3.C87412m.m108592e(r0, r2)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload r0 = (com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveIntPayload) r0
                di3.d r2 = di3.C86312j.m106911c(r6)
                kz1.h r2 = (kz1.C88341h) r2
                int r0 = r0.f248281d
                r2.getClass()
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                r1.enableAudioVolumeEvaluation(r0)
                goto L_0x07ff
            L_0x0472:
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                java.lang.String r1 = "disableAudio"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                r0.f255332d = r14
                r2 = 0
                r0.wx0(r2)
                goto L_0x07ff
            L_0x0488:
                r2 = 0
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                java.lang.String r1 = "enableAudio"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                r0.f255332d = r2
                r0.wx0(r14)
                goto L_0x07ff
            L_0x049e:
                r2 = 0
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                java.lang.String r3 = "pauseLive"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
                r0.vx0(r2)
                r0.wx0(r2)
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                r0.a50(r14)
                di3.d r0 = di3.C86312j.m106911c(r5)
                mz1.h r0 = (mz1.C88864h) r0
                r0.getClass()
                java.lang.String r1 = "pause"
                r4 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                mz1.k r0 = r0.f256318d
                if (r0 == 0) goto L_0x07ff
                r3 = r16
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                mz1.n r1 = new mz1.n
                r1.<init>(r0)
                r0.mo148312q(r1)
                goto L_0x07ff
            L_0x04e1:
                r4 = r18
                r3 = r16
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                java.lang.String r2 = "resumeLive"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                r0.vx0(r14)
                boolean r2 = r0.f255332d
                if (r2 != 0) goto L_0x04fe
                r0.wx0(r14)
            L_0x04fe:
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                r0.mo85093vB(r14)
                di3.d r0 = di3.C86312j.m106911c(r5)
                mz1.h r0 = (mz1.C88864h) r0
                r0.getClass()
                java.lang.String r1 = "resume"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                mz1.k r0 = r0.f256318d
                if (r0 == 0) goto L_0x07ff
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                mz1.p r1 = new mz1.p
                r1.<init>(r0)
                r0.mo148312q(r1)
                goto L_0x07ff
            L_0x0527:
                di3.d r2 = di3.C86312j.m106911c(r6)
                kz1.h r2 = (kz1.C88341h) r2
                r2.getClass()
                di3.d r2 = di3.C86312j.m106911c(r1)
                ir.n r2 = (p565ir.C60606n) r2
                te3.ey0 r2 = r2.zg0()
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                java.lang.String r1 = r1.l90()
                r3 = 2
                rx3.l[] r3 = new rx3.C13604l[r3]
                rx3.l r4 = new rx3.l
                java.lang.String r5 = "topic"
                r4.<init>(r5, r1)
                r1 = 0
                r3[r1] = r4
                if (r2 == 0) goto L_0x055f
                int r1 = r2.f183045d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x0560
            L_0x055f:
                r1 = 0
            L_0x0560:
                rx3.l r2 = new rx3.l
                java.lang.String r4 = "startTime"
                r2.<init>(r4, r1)
                r3[r14] = r2
                java.util.Map r1 = sx3.C90364q0.m113147f(r3)
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload r10 = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload
                java.lang.Object r2 = r1.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x057d
                int r14 = java.lang.Integer.parseInt(r2)
                goto L_0x057e
            L_0x057d:
                r14 = 0
            L_0x057e:
                java.lang.Object r1 = r1.get(r5)
                java.lang.String r1 = (java.lang.String) r1
                r10.<init>(r14, r1)
                if (r0 == 0) goto L_0x07ff
                com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData r1 = new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData
                com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b r7 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionUnknown
                r8 = 0
                r9 = 0
                r11 = 6
                r12 = 0
                r6 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r0.mo894a(r1)
                goto L_0x07ff
            L_0x059a:
                com.tencent.mm.feature.gamelive.d r2 = new com.tencent.mm.feature.gamelive.d
                r2.<init>(r0)
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                kz1.i r1 = new kz1.i
                r1.<init>(r2)
                r0.mo84999ES(r1)
                goto L_0x07ff
            L_0x05b8:
                r4 = r18
                r3 = r16
                android.os.Parcelable r0 = r2.f237647g
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService.Payload"
                gy3.C87412m.m108592e(r0, r2)
                com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload r0 = (com.tencent.p014mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService.Payload) r0
                di3.d r2 = di3.C86312j.m106911c(r5)
                mz1.h r2 = (mz1.C88864h) r2
                int r5 = r0.f81453d
                int r0 = r0.f81454e
                r2.getClass()
                if (r5 == 0) goto L_0x07ff
                if (r0 == 0) goto L_0x07ff
                int r6 = r2.f256319e
                if (r5 != r6) goto L_0x05e0
                int r6 = r2.f256320f
                if (r0 != r6) goto L_0x05e0
                goto L_0x07ff
            L_0x05e0:
                r2.f256319e = r5
                r2.f256320f = r0
                r6 = 1065353216(0x3f800000, float:1.0)
                r7 = 1156579328(0x44f00000, float:1920.0)
                if (r5 <= r0) goto L_0x05f1
                float r8 = (float) r5
                float r7 = r7 / r8
                int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x05f8
                goto L_0x05f9
            L_0x05f1:
                float r8 = (float) r0
                float r7 = r7 / r8
                int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x05f8
                goto L_0x05f9
            L_0x05f8:
                r6 = r7
            L_0x05f9:
                float r7 = (float) r5
                float r7 = r7 * r6
                int r7 = (int) r7
                int r8 = r7 / 16
                r9 = 16
                int r8 = r8 * 16
                int r7 = r7 % r9
                if (r7 != 0) goto L_0x0608
                r7 = 0
                goto L_0x060a
            L_0x0608:
                r7 = 16
            L_0x060a:
                int r8 = r8 + r7
                float r7 = (float) r0
                float r7 = r7 * r6
                int r6 = (int) r7
                int r7 = r6 / 16
                int r7 = r7 * 16
                int r6 = r6 % r9
                if (r6 != 0) goto L_0x0617
                r9 = 0
            L_0x0617:
                int r7 = r7 + r9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "setSize "
                r6.append(r9)
                r6.append(r5)
                r9 = 32
                r6.append(r9)
                r6.append(r0)
                r6.append(r9)
                r6.append(r8)
                r6.append(r9)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                if (r5 >= r0) goto L_0x064a
                goto L_0x064b
            L_0x064a:
                r14 = 0
            L_0x064b:
                r1.Bs0(r8, r7, r14)
                mz1.k r1 = r2.f256318d
                if (r1 == 0) goto L_0x07ff
                r1.f328263i = r5
                r1.f328264j = r0
                mz1.q r2 = r1.f328261g
                r2.mo159591u(r5, r0)
                k90.d r2 = r1.f328262h
                r4 = 0
                r2.mo160067e(r4, r5, r0)
                k90.d r2 = r1.f328262h
                p80.c r2 = r2.mo160065c()
                if (r2 == 0) goto L_0x066d
                r2.f329657j = r5
                r2.f329658n = r0
            L_0x066d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "updateSize "
                r2.append(r4)
                r2.append(r5)
                r2.append(r9)
                r2.append(r0)
                java.lang.String r4 = " push: "
                r2.append(r4)
                r2.append(r8)
                r2.append(r9)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                mz1.f r2 = r1.f328266o
                if (r2 == 0) goto L_0x069d
                r2.mo143263u(r5, r0)
            L_0x069d:
                mz1.f r0 = r1.f328266o
                if (r0 == 0) goto L_0x07ff
                r0.mo158522s(r8, r7)
                goto L_0x07ff
            L_0x06a6:
                r4 = r18
                di3.d r1 = di3.C86312j.m106911c(r5)
                mz1.h r1 = (mz1.C88864h) r1
                com.tencent.mm.feature.gamelive.a r2 = new com.tencent.mm.feature.gamelive.a
                r2.<init>(r0)
                r1.getClass()
                mz1.k r0 = r1.f256318d
                if (r0 != 0) goto L_0x06c6
                java.lang.String r0 = "renderMgr is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r0 = 0
                r2.mo112615a(r0)
                goto L_0x07ff
            L_0x06c6:
                mz1.g r1 = new mz1.g
                r1.<init>(r2)
                k90.d r2 = r0.f328262h
                android.graphics.SurfaceTexture r2 = r2.mo160064b()
                if (r2 != 0) goto L_0x06dc
                mz1.l r2 = new mz1.l
                r2.<init>(r1, r0)
                r0.f328270s = r2
                goto L_0x07ff
            L_0x06dc:
                k90.d r0 = r0.f328262h
                android.graphics.SurfaceTexture r0 = r0.mo160064b()
                r1.invoke(r0)
                goto L_0x07ff
            L_0x06e7:
                r4 = r18
                di3.d r0 = di3.C86312j.m106911c(r5)
                mz1.h r0 = (mz1.C88864h) r0
                android.os.Parcelable r1 = r2.f237647g
                android.view.Surface r1 = (android.view.Surface) r1
                r0.getClass()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "setOnScreenSurface "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                mz1.k r0 = r0.f256318d
                if (r0 != 0) goto L_0x0711
                goto L_0x07ff
            L_0x0711:
                mz1.m r2 = new mz1.m
                r2.<init>(r0, r1)
                r0.mo148312q(r2)
                goto L_0x07ff
            L_0x071b:
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2 = 0
                r0.mo85099wF(r2, r1)
                goto L_0x07ff
            L_0x0734:
                di3.d r0 = di3.C86312j.m106911c(r6)
                kz1.h r0 = (kz1.C88341h) r0
                r0.getClass()
                di3.d r0 = di3.C86312j.m106911c(r1)
                ir.n r0 = (p565ir.C60606n) r0
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r0.mo85099wF(r14, r1)
                goto L_0x07ff
            L_0x074c:
                r4 = r18
                di3.d r1 = di3.C86312j.m106911c(r6)
                kz1.h r1 = (kz1.C88341h) r1
                r1.getClass()
                java.lang.String r2 = "stop push"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                r2 = 0
                r1.vx0(r2)
                di3.d r1 = di3.C86312j.m106911c(r5)
                mz1.h r1 = (mz1.C88864h) r1
                r1.getClass()
                java.lang.String r5 = "stop main process render"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                r1.vx0(r2)
                mz1.k r2 = r1.f256318d
                if (r2 == 0) goto L_0x077f
                mz1.o r4 = new mz1.o
                r4.<init>(r2)
                r2.mo148312q(r4)
            L_0x077f:
                r2 = 0
                r1.f256318d = r2
                di3.d r1 = di3.C86312j.m106911c(r3)
                lz1.j r1 = (lz1.C88684j) r1
                r1.getClass()
                r1 = 0
                lz1.C88684j.f256034g = r1
                java.lang.String r1 = "stop main audio"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
                if (r0 == 0) goto L_0x07ff
                r0.mo894a(r2)
                goto L_0x07ff
            L_0x079a:
                r4 = r18
                di3.d r2 = di3.C86312j.m106911c(r6)
                kz1.h r2 = (kz1.C88341h) r2
                r2.getClass()
                java.lang.String r2 = "start push"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                di3.d r2 = di3.C86312j.m106911c(r5)
                mz1.h r2 = (mz1.C88864h) r2
                r2.getClass()
                java.lang.String r5 = "start main process render"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                r2.vx0(r14)
                mz1.k r4 = new mz1.k
                r4.<init>()
                r2.f256318d = r4
                r4 = 0
                r2.f256319e = r4
                r2.f256320f = r4
                di3.d r2 = di3.C86312j.m106911c(r3)
                lz1.j r2 = (lz1.C88684j) r2
                r2.getClass()
                java.lang.String r3 = "start main audio"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
                lz1.C88684j.f256034g = r14
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                r1.mo85054dz(r14)
                r1.mo85094vK(r14, r4)
                zt3.b r1 = r2.f256035d
                java.lang.Runnable r2 = r2.f256037f
                r1.execute(r2)
                if (r0 == 0) goto L_0x07ff
                r1 = 0
                r0.mo894a(r1)
                goto L_0x07ff
            L_0x07f4:
                java.lang.Class<com.tencent.mm.feature.gamelive.GameLiveCommonService> r0 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.feature.gamelive.GameLiveCommonService r0 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r0
                r0.xx0()
            L_0x07ff:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80854b.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$c */
    public enum C80855c {
        PrePareScene_Origin(0),
        PrePareScene_GameStart(1),
        PrePareScene_FinderStart(2);
        

        /* renamed from: d */
        public final int f237688d;

        /* access modifiers changed from: public */
        C80855c(int i) {
            this.f237688d = i;
        }
    }

    public final void Ax0(C80853a aVar) {
        if (aVar != null) {
            f237640g.putInt("gameLiveCurrentState_", aVar.f237683d);
        }
    }

    public final void Bx0(boolean z) {
        this.f237642e = z;
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.PluginGameLive", Dx0("zbql:update isLiving: " + z));
            f237640g.putBoolean("isLiving", z);
        }
    }

    public final void Cx0(String str) {
        f237640g.putString("onLiveAppId", str);
        if (MMApplicationContext.isMainProcess()) {
            Bx0(((C60606n) C86312j.m106911c(C60606n.class)).mo85002F());
        }
    }

    public final String Dx0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" [appId:");
        MultiProcessMMKV multiProcessMMKV = f237640g;
        sb.append(multiProcessMMKV.getString("onLiveAppId", (String) null));
        sb.append(" versionType:");
        sb.append(multiProcessMMKV.getInt("onLiveVersionType", 0));
        sb.append(']');
        return sb.toString();
    }

    public Boolean Qq0(String str, int i) {
        C87412m.m108594g(str, "appId");
        MultiProcessMMKV multiProcessMMKV = f237640g;
        boolean z = false;
        if (C87412m.m108589b(multiProcessMMKV.getString("onLiveAppId", (String) null), str) && multiProcessMMKV.getInt("onLiveVersionType", 0) == i && xx0()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: YV */
    public void mo112601YV(Boolean bool) {
        f237640g.putBoolean("disableLiveInfo", !bool.booleanValue());
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.PluginGameLive", "onAccountInitialized");
            yx0();
            this.f237643f = f237640g.getBoolean("onLivingStatusForCrashCheck", false);
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.PluginGameLive", "onAccountRelease");
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
    }

    public final String vx0() {
        return f237640g.getString("appbrandPackageName", "");
    }

    public final C80853a wx0() {
        int i = f237640g.getInt("gameLiveCurrentState_", 0);
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? C80853a.GameLiveState_NotInited : C80853a.GameLiveState_Destroy : C80853a.GameLiveState_LivingBackGround : C80853a.GameLiveState_LivingForeGround : C80853a.GameLiveState_PrePare;
    }

    public final boolean xx0() {
        Bx0(MMApplicationContext.isMainProcess() ? ((C60606n) C86312j.m106911c(C60606n.class)).mo85002F() : f237640g.getBoolean("isLiving", false));
        return this.f237642e;
    }

    public final void yx0() {
        Log.m105924i("MicroMsg.PluginGameLive", Dx0("resetState"));
        Cx0("");
        MultiProcessMMKV multiProcessMMKV = f237640g;
        multiProcessMMKV.putInt("onLiveVersionType", 0);
        multiProcessMMKV.putBoolean("isPushing", false);
        multiProcessMMKV.putBoolean("disableMicInfo", false);
        multiProcessMMKV.putBoolean("disableLiveInfo", false);
        Ax0(C80853a.GameLiveState_NotInited);
        multiProcessMMKV.putInt("gameLivePrepareScene", 0);
        xx0();
    }

    public final void zx0(String str) {
        C87412m.m108594g(str, "name");
        Log.m105924i("MicroMsg.PluginGameLive", "zbql:setAppBrandPackageName," + str);
        f237640g.putString("appbrandPackageName", str);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/feature/gamelive/GameLiveCommonService$IPCLiveControlData;", "Landroid/os/Parcelable;", "b", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData */
    public static final class IPCLiveControlData implements Parcelable {
        public static final Parcelable.Creator<IPCLiveControlData> CREATOR = new C80851a();

        /* renamed from: d */
        public final C80852b f237644d;

        /* renamed from: e */
        public final String f237645e;

        /* renamed from: f */
        public final int f237646f;

        /* renamed from: g */
        public final Parcelable f237647g;

        /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$a */
        public static final class C80851a implements Parcelable.Creator<IPCLiveControlData> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new IPCLiveControlData(C80852b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readParcelable(IPCLiveControlData.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new IPCLiveControlData[i];
            }
        }

        /* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b */
        public enum C80852b {
            IPCLiveControlActionUnknown,
            IPCLiveControlActionSyncLiveState,
            IPCLiveControlActionStartPush,
            IPCLiveControlActionStopPush,
            IPCLiveControlActionMinimizeGameLive,
            IPCLiveControlActionHideMinimizeGameLive,
            IPCLiveControlActionSetOnScreenSurfaceTexture,
            IPCLiveControlActionGetInputSurfaceTexture,
            IPCLiveControlActionSetSize,
            IPCLiveControlActionGetMemberList,
            IPCLiveControlActionGetCurrentRoomInfo,
            IPCLiveControlActionResumeLive,
            IPCLiveControlActionPauseLive,
            IPCLiveControlActionEnableMute,
            IPCLiveControlActionDisableMute,
            IPCLiveControlActionSendVolumnCallBackDuration,
            IPCLiveControlActionAudioReconnect,
            IPCLiveControlActionPlayGameCgi,
            IPCLiveControlActionPlayGamePanelShowReport,
            IPCLiveControlActionSetTopic,
            IPCLiveControlActionReportAnchorEntranceEvent,
            IPCLiveEventUserCancel,
            IPCLiveEventUserStopLiveFromFinderLive,
            IPCLiveEventLiveDidStart,
            IPCLiveShareToFriendCallBack,
            IPCLiveSendCommentInfo,
            IPCLiveSendVolumnInfo,
            IPCLiveSendNetWorkInfo
        }

        public IPCLiveControlData(C80852b bVar, String str, int i, Parcelable parcelable) {
            C87412m.m108594g(bVar, "action");
            this.f237644d = bVar;
            this.f237645e = str;
            this.f237646f = i;
            this.f237647g = parcelable;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IPCLiveControlData)) {
                return false;
            }
            IPCLiveControlData iPCLiveControlData = (IPCLiveControlData) obj;
            return this.f237644d == iPCLiveControlData.f237644d && C87412m.m108589b(this.f237645e, iPCLiveControlData.f237645e) && this.f237646f == iPCLiveControlData.f237646f && C87412m.m108589b(this.f237647g, iPCLiveControlData.f237647g);
        }

        public int hashCode() {
            int hashCode = this.f237644d.hashCode() * 31;
            String str = this.f237645e;
            int i = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f237646f) * 31;
            Parcelable parcelable = this.f237647g;
            if (parcelable != null) {
                i = parcelable.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "IPCLiveControlData(action=" + this.f237644d + ", appId=" + this.f237645e + ", versionType=" + this.f237646f + ", payload=" + this.f237647g + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f237644d.name());
            parcel.writeString(this.f237645e);
            parcel.writeInt(this.f237646f);
            parcel.writeParcelable(this.f237647g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IPCLiveControlData(C80852b bVar, String str, int i, Parcelable parcelable, int i2, C8480h hVar) {
            this(bVar, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : parcelable);
        }
    }
}
