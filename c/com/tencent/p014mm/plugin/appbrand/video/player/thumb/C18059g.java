package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import android.content.Context;
import android.view.Surface;
import com.tencent.p014mm.hardcoder.HardCoderJNI;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.tplayer.TPPlayer;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60184m;
import ht1.C60200t1;
import in0.C87760d;
import in0.d$$a;
import in0.d$$c;
import in0.d$$d;
import in0.d$$e;
import in0.d$$f;
import in0.d$$g;
import in0.d$$h;
import in0.d$$i;
import in0.d$$j;
import in0.d$$k;
import in0.d$$l;
import kotlin.Metadata;
import o40.C61926c;
import p1081gi.C98127h;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C64888zo1;
import u62.C22583d;
import u62.C22597f;
import u62.C22598g;
import u62.C22599h;
import v62.C22715a;
import z04.C112550d0;
import z62.C66735c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.g */
public final class C18059g implements C87760d {

    /* renamed from: a */
    public C22598g f49899a;

    /* renamed from: b */
    public C22597f f49900b;

    /* renamed from: c */
    public C18060a f49901c = new C18060a();

    /* renamed from: d */
    public volatile boolean f49902d;

    /* renamed from: e */
    public boolean f49903e;

    /* renamed from: f */
    public Integer f49904f;

    /* renamed from: g */
    public C64888zo1 f49905g;

    /* renamed from: h */
    public d$$i f49906h;

    /* renamed from: i */
    public d$$g f49907i;

    /* renamed from: j */
    public d$$j f49908j;

    /* renamed from: k */
    public d$$d f49909k;

    /* renamed from: l */
    public d$$k f49910l;

    /* renamed from: m */
    public d$$c f49911m;

    /* renamed from: n */
    public d$$l f49912n;

    /* renamed from: o */
    public d$$f f49913o;

    /* renamed from: p */
    public boolean f49914p;

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.g$a */
    public final class C18060a implements C22583d.C22591h, C22583d.C22584a, C22583d.C22594k, C22583d.C22589f, C22583d.C22593j, C22583d.C22585b, C22583d.C22587d, C22583d.C22588e, C22583d.C22590g, C22583d.C22592i {
        public C18060a() {
        }

        /* renamed from: f */
        public void mo22592f(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C18059g gVar = C18059g.this;
            d$$l d__l = gVar.f49912n;
            if (d__l != null) {
                d__l.mo17989a(gVar, i, i2);
            }
        }

        /* renamed from: h */
        public void mo22593h(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C18059g gVar = C18059g.this;
            gVar.f49902d = false;
            d$$k d__k = gVar.f49910l;
            if (d__k != null) {
                d__k.mo17988a(gVar);
            }
        }

        /* renamed from: i */
        public void mo22594i(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            Log.m105924i(C18059g.this.mo22589x(), "onFirstFrameRenderStart");
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01e1  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo22595j(u62.C22583d r18, int r19, long r20, long r22, java.lang.Object r24) {
            /*
                r17 = this;
                r1 = r17
                r0 = r19
                r2 = r20
                r4 = r22
                r6 = r24
                java.lang.String r7 = "mp"
                r8 = r18
                gy3.C87412m.m108594g(r8, r7)
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r7 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                java.lang.String r7 = r7.mo22589x()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "onInfo, what: "
                r8.append(r9)
                r8.append(r0)
                java.lang.String r9 = ", arg1: "
                r8.append(r9)
                r8.append(r2)
                java.lang.String r9 = ", arg2: "
                r8.append(r9)
                r8.append(r4)
                java.lang.String r10 = ", extraObject: "
                r8.append(r10)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
                r7 = 0
                r8 = 201(0xc9, float:2.82E-43)
                if (r8 != r0) goto L_0x0067
                r11 = 7
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r12 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                int r12 = r12.getState()
                if (r11 != r12) goto L_0x0067
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r11 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                java.lang.String r11 = r11.mo22589x()
                java.lang.String r12 = "onInfo, buffering end when COMPLETE, notify seek complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r11 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                r11.f49902d = r7
                in0.d$$k r12 = r11.f49910l
                if (r12 == 0) goto L_0x0067
                r12.mo17988a(r11)
            L_0x0067:
                r11 = 106(0x6a, float:1.49E-43)
                r12 = 3
                java.lang.String r13 = "player"
                java.lang.String r14 = "null cannot be cast to non-null type com.tencent.thumbplayer.tplayer.TPPlayer"
                r15 = -1
                r16 = 0
                if (r0 == r11) goto L_0x00d0
                r11 = 200(0xc8, float:2.8E-43)
                if (r0 == r11) goto L_0x009b
                if (r0 == r8) goto L_0x007b
                goto L_0x00cd
            L_0x007b:
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                boolean r11 = r8.f49903e
                if (r11 == 0) goto L_0x00cd
                r8.f49903e = r7
                r12 = 702(0x2be, float:9.84E-43)
                u62.g r8 = r8.f49899a
                if (r8 == 0) goto L_0x0097
                java.lang.Object r8 = r8.mo35694p()
                gy3.C87412m.m108592e(r8, r14)
                com.tencent.thumbplayer.tplayer.TPPlayer r8 = (com.tencent.thumbplayer.tplayer.TPPlayer) r8
                int r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C104818d.m140486b(r8)
                goto L_0x00d1
            L_0x0097:
                gy3.C87412m.m108603p(r13)
                throw r16
            L_0x009b:
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                int r8 = r8.getState()
                r11 = 1
                if (r12 != r8) goto L_0x00a6
                r8 = 1
                goto L_0x00a7
            L_0x00a6:
                r8 = 0
            L_0x00a7:
                if (r8 != 0) goto L_0x00cd
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                boolean r8 = r8.f49902d
                if (r8 != 0) goto L_0x00cd
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                u62.g r8 = r8.f49899a
                if (r8 == 0) goto L_0x00c9
                java.lang.Object r8 = r8.mo35694p()
                gy3.C87412m.m108592e(r8, r14)
                com.tencent.thumbplayer.tplayer.TPPlayer r8 = (com.tencent.thumbplayer.tplayer.TPPlayer) r8
                int r8 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C104818d.m140486b(r8)
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r12 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                r12.f49903e = r11
                r11 = 701(0x2bd, float:9.82E-43)
                goto L_0x00d2
            L_0x00c9:
                gy3.C87412m.m108603p(r13)
                throw r16
            L_0x00cd:
                r8 = 0
                r11 = -1
                goto L_0x00d2
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                r11 = r12
            L_0x00d2:
                if (r15 == r11) goto L_0x00dd
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r12 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                in0.d$$i r15 = r12.f49906h
                if (r15 == 0) goto L_0x00dd
                r15.mo17984a(r12, r11, r8)
            L_0x00dd:
                r8 = 1006(0x3ee, float:1.41E-42)
                if (r8 != r0) goto L_0x0139
                boolean r11 = r6 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo
                if (r11 != 0) goto L_0x00f1
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r11 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                java.lang.String r11 = r11.mo22589x()
                java.lang.String r12 = "onInfo, extraObject is not TPDownLoadProgressInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)
                goto L_0x0139
            L_0x00f1:
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r11 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                u62.g r12 = r11.f49899a
                if (r12 == 0) goto L_0x0135
                java.lang.Object r12 = r12.mo35694p()
                gy3.C87412m.m108592e(r12, r14)
                com.tencent.thumbplayer.tplayer.TPPlayer r12 = (com.tencent.thumbplayer.tplayer.TPPlayer) r12
                int r12 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C104818d.m140486b(r12)
                java.lang.String r15 = r11.mo22589x()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "notifyOnBufferingUpdate, percent:"
                r7.append(r8)
                r7.append(r12)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r7)
                java.lang.Integer r7 = r11.f49904f
                if (r7 != 0) goto L_0x0121
                goto L_0x0127
            L_0x0121:
                int r7 = r7.intValue()
                if (r12 == r7) goto L_0x0139
            L_0x0127:
                in0.d$$c r7 = r11.f49911m
                if (r7 == 0) goto L_0x012e
                r7.mo17990a(r11, r12)
            L_0x012e:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
                r11.f49904f = r7
                goto L_0x0139
            L_0x0135:
                gy3.C87412m.m108603p(r13)
                throw r16
            L_0x0139:
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r7 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.this
                u62.g r8 = r7.f49899a
                if (r8 == 0) goto L_0x01e1
                java.lang.Object r8 = r8.mo35694p()
                gy3.C87412m.m108592e(r8, r14)
                com.tencent.thumbplayer.tplayer.TPPlayer r8 = (com.tencent.thumbplayer.tplayer.TPPlayer) r8
                java.lang.String r8 = r7.mo22589x()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "onTTPlayerInfoUpdate：what:"
                r11.append(r12)
                r11.append(r0)
                java.lang.String r12 = "  arg1: "
                r11.append(r12)
                r11.append(r2)
                r11.append(r9)
                r11.append(r4)
                r11.append(r10)
                r11.append(r6)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r11)
                r8 = 252(0xfc, float:3.53E-43)
                if (r0 == r8) goto L_0x01a3
                r8 = 1006(0x3ee, float:1.41E-42)
                if (r0 == r8) goto L_0x017e
                goto L_0x01e0
            L_0x017e:
                java.lang.String r0 = r7.mo22589x()     // Catch:{ Exception -> 0x01d3 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d3 }
                r8.<init>()     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r11 = "TP_PLAYER_INFO_OBJECT_DOWNLOAD_PROGRESS_UPDATE：arg1: "
                r8.append(r11)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r2)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r9)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r4)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r10)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r6)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x01d3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x01d3 }
                goto L_0x01e0
            L_0x01a3:
                java.lang.String r0 = r7.mo22589x()     // Catch:{ Exception -> 0x01d3 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d3 }
                r8.<init>()     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r11 = "TP_PLAYER_INFO_LONG1_ADAPTIVE_SWITCH_DEF_END：arg1: "
                r8.append(r11)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r2)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r9)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r4)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r10)     // Catch:{ Exception -> 0x01d3 }
                r8.append(r6)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x01d3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x01d3 }
                in0.d$$f r0 = r7.f49913o     // Catch:{ Exception -> 0x01d3 }
                if (r0 == 0) goto L_0x01e0
                java.lang.String r2 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x01d3 }
                r0.mo17991a(r2)     // Catch:{ Exception -> 0x01d3 }
                goto L_0x01e0
            L_0x01d3:
                r0 = move-exception
                java.lang.String r2 = r7.mo22589x()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            L_0x01e0:
                return
            L_0x01e1:
                gy3.C87412m.m108603p(r13)
                throw r16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g.C18060a.mo22595j(u62.d, int, long, long, java.lang.Object):void");
        }

        /* renamed from: k */
        public void mo22596k(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            String x = C18059g.this.mo22589x();
            Log.m105924i(x, "onStateChange from " + i + " to " + i2);
        }

        /* renamed from: l */
        public void mo22597l(C22583d dVar, long j, long j2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        }

        /* renamed from: n */
        public void mo22598n(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            Log.m105924i(C18059g.this.mo22589x(), "onBufferingEnd");
        }

        /* renamed from: o */
        public void mo22599o(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C18059g gVar = C18059g.this;
            d$$d d__d = gVar.f49909k;
            if (d__d != null) {
                d__d.mo17987a(gVar);
            }
        }

        /* renamed from: p */
        public void mo22600p(C22583d dVar, C22599h hVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C87412m.m108594g(hVar, "mediaInfo");
            C18059g gVar = C18059g.this;
            d$$j d__j = gVar.f49908j;
            if (d__j != null) {
                d__j.mo17986a(gVar);
            }
        }

        /* renamed from: q */
        public void mo22601q(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            String x = C18059g.this.mo22589x();
            Log.m105928w(x, "onError, errorType: " + i + ", errorCode: " + i2 + ", errorType: " + i + ", errorCode: " + i2);
            if (1000 != i2) {
                if (1100 == i) {
                    boolean z = false;
                    if (11070000 <= i2 && i2 < 11080000) {
                        z = true;
                    }
                    if (z) {
                        C18059g gVar = C18059g.this;
                        int i3 = i2 - 11070000;
                        d$$g d__g = gVar.f49907i;
                        if (d__g != null) {
                            d__g.mo17985a(gVar, HardCoderJNI.CLIENT_CONNECT, i3);
                            return;
                        }
                        return;
                    }
                }
                C18059g gVar2 = C18059g.this;
                int i4 = -10000 - i;
                d$$g d__g2 = gVar2.f49907i;
                if (d__g2 != null) {
                    d__g2.mo17985a(gVar2, i4, i2);
                }
            }
        }

        /* renamed from: u */
        public void mo22602u(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            Log.m105924i(C18059g.this.mo22589x(), "onBufferingStart");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.g$b */
    public static final class C18061b<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C18061b<InputType, ResultType> f49916d = new C18061b<>();

        public void invoke(Object obj, C1256g gVar) {
            C64888zo1 zo12 = ((WebViewVideoFinderActionHandler.FinderVideoInfoForMpWrapper) obj).f164768d;
            if (zo12 != null) {
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                String str = zo12.f186759e;
                if (str == null) {
                    str = "";
                }
                String str2 = zo12.f186760f;
                String str3 = str2 == null ? "" : str2;
                int i = zo12.f186762h;
                String str4 = zo12.f186763i;
                t1Var.mo76899xw(str, "", str3, i, str4 == null ? "" : str4, zo12.f186771t, zo12.f186769r, zo12.f186770s, zo12.f186772u, zo12.f186773v, zo12.f186764j, zo12.f186765n, zo12.f186757B);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.g$c */
    public static final class C18062c extends C87413o implements C32226l<IPCVoid, C13598b0> {

        /* renamed from: d */
        public static final C18062c f49917d = new C18062c();

        public C18062c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IPCVoid) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    public C18059g() {
        C18054e eVar = C18054e.f49894a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        eVar.mo22566d(context, false);
        this.f49900b = new C18057f();
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108593f(context2, "getContext()");
        Log.m105924i("MMPlayerFactory", "buildMPPlayer");
        C22598g gVar = new C22598g(new C22715a(new TPPlayer(context2), (C8480h) null));
        this.f49899a = gVar;
        gVar.mo35666m(this.f49901c);
        C22598g gVar2 = this.f49899a;
        if (gVar2 != null) {
            gVar2.mo35664k(this.f49901c);
            C22598g gVar3 = this.f49899a;
            if (gVar3 != null) {
                gVar3.mo35667n(this.f49901c);
                C22598g gVar4 = this.f49899a;
                if (gVar4 != null) {
                    gVar4.mo35661h(this.f49901c);
                    C22598g gVar5 = this.f49899a;
                    if (gVar5 != null) {
                        gVar5.mo35662i(this.f49901c);
                        C22598g gVar6 = this.f49899a;
                        if (gVar6 != null) {
                            gVar6.mo35658g(this.f49901c);
                            C22598g gVar7 = this.f49899a;
                            if (gVar7 != null) {
                                gVar7.mo35656d(this.f49901c);
                                C22598g gVar8 = this.f49899a;
                                if (gVar8 != null) {
                                    gVar8.mo35668o(this.f49901c);
                                    C22598g gVar9 = this.f49899a;
                                    if (gVar9 != null) {
                                        gVar9.mo35657e(this.f49901c);
                                        C22598g gVar10 = this.f49899a;
                                        if (gVar10 != null) {
                                            gVar10.mo35663j(this.f49901c);
                                            C22598g gVar11 = this.f49899a;
                                            if (gVar11 != null) {
                                                C22597f fVar = this.f49900b;
                                                if (fVar != null) {
                                                    gVar11.mo35655c(fVar);
                                                    Log.m105924i(mo22589x(), "initPlayer");
                                                    return;
                                                }
                                                C87412m.m108603p("onePlayContext");
                                                throw null;
                                            }
                                            C87412m.m108603p("player");
                                            throw null;
                                        }
                                        C87412m.m108603p("player");
                                        throw null;
                                    }
                                    C87412m.m108603p("player");
                                    throw null;
                                }
                                C87412m.m108603p("player");
                                throw null;
                            }
                            C87412m.m108603p("player");
                            throw null;
                        }
                        C87412m.m108603p("player");
                        throw null;
                    }
                    C87412m.m108603p("player");
                    throw null;
                }
                C87412m.m108603p("player");
                throw null;
            }
            C87412m.m108603p("player");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: A */
    public final void mo22575A(C64888zo1 zo12) {
        C87412m.m108594g(zo12, "videoInfo");
        this.f49905g = zo12;
        this.f49914p = true;
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_FinderUtil";
        hVar.field_mediaId = zo12.f186759e;
        hVar.f287705p0 = zo12.f186760f + zo12.f186764j;
        hVar.f287673t = 60;
        hVar.f287674u = 60;
        hVar.f287689V = 1;
        hVar.f287655L = 8;
        hVar.f287698Z0 = 0;
        hVar.field_requestVideoFormat = zo12.f186762h;
        hVar.f287699a1 = zo12.f186763i;
        hVar.field_fullpath = zo12.f186761g;
        hVar.f287696Y0 = C60184m.C60185a.f171718a;
        hVar.f287657N = 4;
        hVar.f287700b1 = zo12.f186765n;
        hVar.f287665i = zo12.f186766o;
        hVar.f287688U0 = String.valueOf(zo12.f186767p);
        String str = zo12.f186759e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = zo12.f186760f;
        if (str3 == null) {
            str3 = str2;
        }
        C66735c cVar = new C66735c(str, str3, hVar);
        C22597f fVar = this.f49900b;
        if (fVar != null) {
            String str4 = zo12.f186759e;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = zo12.f186761g;
            if (str5 != null) {
                str2 = str5;
            }
            C18045b bVar = new C18045b(fVar, str4, str2);
            String x = mo22589x();
            StringBuilder sb = new StringBuilder();
            sb.append("setFinderVideoInfoForMp mediaId:");
            sb.append(zo12.f186759e);
            sb.append(" feedId:");
            FinderObject finderObject = zo12.f186758d;
            sb.append(C61926c.m72691p(finderObject != null ? finderObject.f164794id : 0));
            sb.append(" videoFileStateCache:");
            sb.append(bVar);
            Log.m105924i(x, sb.toString());
            C22597f fVar2 = this.f49900b;
            if (fVar2 != null) {
                fVar2.mo35706g(cVar, bVar);
                String x2 = mo22589x();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("setFinderVideoInfoForMp attach videoFileStateCache:");
                C22597f fVar3 = this.f49900b;
                if (fVar3 != null) {
                    sb4.append(fVar3.mo35701e());
                    Log.m105924i(x2, sb4.toString());
                    mo22590y(zo12);
                    C22598g gVar = this.f49899a;
                    if (gVar != null) {
                        gVar.mo35688f(cVar);
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("onePlayContext");
                    throw null;
                }
            } else {
                C87412m.m108603p("onePlayContext");
                throw null;
            }
        } else {
            C87412m.m108603p("onePlayContext");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo22532a(float f, float f2) {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.mo35686a(f, f2);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo22533b(boolean z) {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.mo35687b(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo22576c(d$$d d__d) {
        this.f49909k = d__d;
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        mo22591z(str, str2, 0);
    }

    /* renamed from: e */
    public void mo22535e(double d) {
        String x = mo22589x();
        Log.m105924i(x, "setPreferredPeakBitRate :" + d);
    }

    /* renamed from: g */
    public void mo22577g(String str, String str2, int i) {
        mo22534d(str, str2);
    }

    public int getCurrentPosition() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return (int) gVar.getCurrentPositionMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getDuration() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return (int) gVar.getDurationMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getPlayerType() {
        return 5;
    }

    public int getState() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return gVar.getState();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getVideoHeight() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return gVar.getVideoHeight();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getVideoWidth() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return gVar.getVideoWidth();
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        setDataSource(str);
    }

    /* renamed from: i */
    public void mo22579i(d$$i d__i) {
        this.f49906h = d__i;
    }

    public boolean isPlaying() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            return gVar.isPlaying();
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: l */
    public boolean mo22543l(float f) {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.setPlaySpeedRatio(f);
            return true;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: m */
    public void mo22580m(String str, String str2, d$$e d__e) {
        ((C119157j) C119157j.f356862d).mo183875f(new d$$a(this, str, str2, d__e));
    }

    /* renamed from: n */
    public void mo22581n(d$$f d__f) {
        this.f49913o = d__f;
    }

    /* renamed from: o */
    public <PlayerImpl extends C87760d> PlayerImpl mo22544o(Class<PlayerImpl> cls) {
        C87412m.m108594g(cls, "playerClass");
        C18059g gVar = C18046c.class.isAssignableFrom(cls) ? this : null;
        String x = mo22589x();
        Log.m105924i(x, "castTo, playerClass: " + cls + ", playerImpl: " + gVar);
        return gVar;
    }

    /* renamed from: p */
    public void mo22582p(d$$h d__h) {
        String x = mo22589x();
        Log.m105928w(x, "setOnHitPreloadListener listener:" + d__h);
    }

    public void pause() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.pause();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void prepareAsync() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.prepareAsync();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: q */
    public void mo22583q(d$$g d__g) {
        this.f49907i = d__g;
    }

    /* renamed from: r */
    public void mo22547r(String str, String str2, String str3, boolean z) {
        C87412m.m108594g(str, "sourceUrl");
        Log.m105928w("WebViewTPPlayer", "setDrmDataSource not support");
    }

    public void release() {
        this.f49914p = false;
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.release();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void reset() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.reset();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: s */
    public void mo22584s(d$$c d__c) {
        this.f49911m = d__c;
    }

    public void seekTo(long j) {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.seekTo(j);
            this.f49902d = true;
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public void setDataSource(String str) {
        if (str == null) {
            str = "";
        }
        mo22591z(str, "", 0);
    }

    public void setMute(boolean z) {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.setOutputMute(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setSurface(Surface surface) {
        String x = mo22589x();
        StringBuilder sb = new StringBuilder();
        sb.append("setSurface ");
        sb.append(surface);
        sb.append(' ');
        sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        Log.m105924i(x, sb.toString());
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.setSurface(surface);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void start() {
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.start();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void stop() {
        C64888zo1 w = mo22588w();
        if (w != null) {
            WebViewVideoFinderActionHandler.FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = new WebViewVideoFinderActionHandler.FinderVideoInfoForMpWrapper();
            finderVideoInfoForMpWrapper.f164768d = w;
            String str = WeChatProcess.PROCESS_MAIN;
            C87412m.m108593f(str, "PROCESS_MAIN");
            C28947a.m38500a(str, finderVideoInfoForMpWrapper, C18061b.f49916d, C18062c.f49917d);
        }
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            gVar.stop();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: t */
    public void mo22585t(d$$l d__l) {
        this.f49912n = d__l;
    }

    /* renamed from: u */
    public void mo22586u(d$$j d__j) {
        this.f49908j = d__j;
    }

    /* renamed from: v */
    public void mo22587v(d$$k d__k) {
        this.f49910l = d__k;
    }

    /* renamed from: w */
    public final C64888zo1 mo22588w() {
        C64888zo1 zo12 = null;
        if (!this.f49914p) {
            Log.m105920e("WebViewTPPlayer", "getFinderVideoInfoForMp not init");
            return null;
        }
        C22597f fVar = this.f49900b;
        if (fVar != null) {
            C18045b bVar = (C18045b) fVar.mo35701e();
            C64888zo1 zo13 = this.f49905g;
            if (zo13 != null) {
                C47465a parseFrom = new C64888zo1().parseFrom(zo13.toByteArray());
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderVideoInfoForMp");
                zo12 = (C64888zo1) parseFrom;
            }
            if (zo12 != null) {
                zo12.f186769r = bVar.f49867e;
                zo12.f186770s = bVar.f49866d;
                zo12.f186772u = bVar.f49870h;
                zo12.f186763i = bVar.f49869g;
                zo12.f186757B = bVar.f49868f;
            }
            return zo12;
        }
        C87412m.m108603p("onePlayContext");
        throw null;
    }

    /* renamed from: x */
    public final String mo22589x() {
        C22597f fVar = this.f49900b;
        if (fVar != null) {
            return fVar.mo35698b("WebViewTPPlayer");
        }
        C87412m.m108603p("onePlayContext");
        throw null;
    }

    /* renamed from: y */
    public final void mo22590y(C64888zo1 zo12) {
        C87412m.m108594g(zo12, "videoInfoForMp");
        if (!this.f49914p) {
            Log.m105920e("WebViewTPPlayer", "resumeFinderVideoInfoForMp not init");
            return;
        }
        C22597f fVar = this.f49900b;
        if (fVar != null) {
            C18045b bVar = (C18045b) fVar.mo35701e();
            if (!C87412m.m108589b(zo12.f186759e, bVar.f49864b)) {
                Log.m105924i("WebViewTPPlayer", "resumeFinderVideoInfoForMp " + zo12.f186759e + " failed.");
                return;
            }
            Log.m105924i("WebViewTPPlayer", "resumeFinderVideoInfoForMp " + zo12.f186759e + " cacheSize:" + zo12.f186769r + " totalSize:" + zo12.f186770s + " dynamicRangeType:" + zo12.f186771t + " state:" + zo12.f186772u + " isMoovReady:" + zo12.f186757B + ' ');
            bVar.f49866d = zo12.f186770s;
            bVar.f49867e = zo12.f186769r;
            bVar.f49870h = zo12.f186772u;
            bVar.f49868f = zo12.f186757B;
            return;
        }
        C87412m.m108603p("onePlayContext");
        throw null;
    }

    /* renamed from: z */
    public final void mo22591z(String str, String str2, int i) {
        String str3;
        String x = mo22589x();
        Log.m105924i(x, "setDataSource, path: " + str + ", videoType:" + i);
        C22598g gVar = this.f49899a;
        if (gVar != null) {
            Object p = gVar.mo35694p();
            TPPlayer tPPlayer = p instanceof TPPlayer ? (TPPlayer) p : null;
            if (tPPlayer != null) {
                tPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000).buildLong(504, 1));
            }
            if (C112550d0.m153803w(str, "http", false, 2, (Object) null)) {
                this.f49914p = true;
                String mD5String = MD5Util.getMD5String(str);
                String str4 = C55564a.f158196a;
                StringBuilder sb = new StringBuilder();
                sb.append(C55564a.f158196a);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("finder_video_");
                String str5 = "";
                sb4.append(str5);
                sb4.append('_');
                if (Util.isNullOrNil(mD5String)) {
                    if (str != null) {
                        str5 = str;
                    }
                    str3 = MD5Util.getMD5String(str5);
                } else {
                    str3 = mD5String;
                }
                sb4.append(str3);
                sb.append(sb4.toString());
                String sb5 = sb.toString();
                C66735c.C66736a aVar = C66735c.f191767d;
                C87412m.m108593f(mD5String, "mediaId");
                C66735c cVar = new C66735c(mD5String, str, aVar.mo90768a(mD5String, str, sb5));
                C22597f fVar = this.f49900b;
                if (fVar != null) {
                    C18045b bVar = new C18045b(fVar, mD5String, sb5);
                    String x2 = mo22589x();
                    Log.m105924i(x2, "setDataSourceImp videoFileStateCache:" + bVar);
                    C22597f fVar2 = this.f49900b;
                    if (fVar2 != null) {
                        fVar2.mo35706g(cVar, bVar);
                        String x3 = mo22589x();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("setDataSourceImp attach videoFileStateCache:");
                        C22597f fVar3 = this.f49900b;
                        if (fVar3 != null) {
                            sb6.append(fVar3.mo35701e());
                            Log.m105924i(x3, sb6.toString());
                            C22598g gVar2 = this.f49899a;
                            if (gVar2 != null) {
                                gVar2.mo35688f(cVar);
                            } else {
                                C87412m.m108603p("player");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("onePlayContext");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("onePlayContext");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("onePlayContext");
                    throw null;
                }
            } else {
                C87412m.m108593f(MD5Util.getMD5String(str), "mediaId");
                C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            }
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }
}
