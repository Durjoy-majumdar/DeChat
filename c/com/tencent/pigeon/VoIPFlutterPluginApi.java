package com.tencent.pigeon;

import android.util.Log;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p749xh.C66261f3;

public class VoIPFlutterPluginApi {

    public interface VoIPPluginApi {

        /* renamed from: com.tencent.pigeon.VoIPFlutterPluginApi$VoIPPluginApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: A */
            public static /* synthetic */ void m35822A(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLBoolType fLBoolType = (FLBoolType) ((ArrayList) obj).get(0);
                    if (fLBoolType != null) {
                        voIPPluginApi.requestRingtoneMute(fLBoolType);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("muteArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: B */
            public static /* synthetic */ void m35823B(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.pauseRing();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: C */
            public static /* synthetic */ void m35824C(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.resumeRing();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: D */
            public static /* synthetic */ void m35825D(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.restartRing();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: E */
            public static /* synthetic */ void m35826E(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FpsParams fpsParams = (FpsParams) ((ArrayList) obj).get(0);
                    if (fpsParams != null) {
                        voIPPluginApi.reportFps(fpsParams);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("pramsArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: F */
            public static /* synthetic */ void m35827F(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.onBooted();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: G */
            public static /* synthetic */ void m35828G(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isSplitScreenSupported());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: H */
            public static /* synthetic */ void m35829H(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.toggleSplitScreen();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: I */
            public static /* synthetic */ void m35830I(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isScreenSplited());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: J */
            public static /* synthetic */ void m35831J(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    MinimizeParams minimizeParams = (MinimizeParams) ((ArrayList) obj).get(0);
                    if (minimizeParams != null) {
                        voIPPluginApi.minimize(minimizeParams, new Result<FLBoolType>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", VoIPFlutterPluginApi.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(FLBoolType fLBoolType) {
                                this.val$wrapped.put("result", fLBoolType);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("paramsArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: K */
            public static /* synthetic */ void m35832K(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.checkWeVisonSupport());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: L */
            public static /* synthetic */ void m35833L(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.queryGPURating());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: M */
            public static /* synthetic */ void m35834M(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        voIPPluginApi.setSegmentVirtualBackground(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("segmentModeArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: N */
            public static /* synthetic */ void m35835N(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                    if (bool != null) {
                        voIPPluginApi.clearVirtualBackground(bool);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("isAutoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: O */
            public static /* synthetic */ void m35836O(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.hideRingtoneHalfDialog();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: P */
            public static /* synthetic */ void m35837P(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.queryAudioRouteInfos());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: Q */
            public static /* synthetic */ void m35838Q(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    AudioRouteInfo audioRouteInfo = (AudioRouteInfo) ((ArrayList) obj).get(0);
                    if (audioRouteInfo != null) {
                        hashMap.put("result", voIPPluginApi.routeToDevice(audioRouteInfo));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("deviceArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: R */
            public static /* synthetic */ void m35839R(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.queryCurrentAudioRouteInfo());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: S */
            public static /* synthetic */ void m35840S(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.switchCamera(new Result<FLBoolType>(hashMap, reply) {
                        public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        public final /* synthetic */ Map val$wrapped;

                        {
                            this.val$wrapped = r1;
                            this.val$reply = r2;
                        }

                        public void error(Throwable th) {
                            this.val$wrapped.put("error", VoIPFlutterPluginApi.wrapError(th));
                            this.val$reply.reply(this.val$wrapped);
                        }

                        public void success(FLBoolType fLBoolType) {
                            this.val$wrapped.put("result", fLBoolType);
                            this.val$reply.reply(this.val$wrapped);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: T */
            public static /* synthetic */ void m35841T(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.switchCameraOpenStatus(new Result<FLBoolType>(hashMap, reply) {
                        public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        public final /* synthetic */ Map val$wrapped;

                        {
                            this.val$wrapped = r1;
                            this.val$reply = r2;
                        }

                        public void error(Throwable th) {
                            this.val$wrapped.put("error", VoIPFlutterPluginApi.wrapError(th));
                            this.val$reply.reply(this.val$wrapped);
                        }

                        public void success(FLBoolType fLBoolType) {
                            this.val$wrapped.put("result", fLBoolType);
                            this.val$reply.reply(this.val$wrapped);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: U */
            public static /* synthetic */ void m35842U(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.switchToVoiceMode());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: V */
            public static /* synthetic */ void m35843V(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLBoolType fLBoolType = (FLBoolType) ((ArrayList) obj).get(0);
                    if (fLBoolType != null) {
                        voIPPluginApi.setMuted(fLBoolType);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("mutedArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: W */
            public static /* synthetic */ void m35844W(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLBoolType fLBoolType = (FLBoolType) ((ArrayList) obj).get(0);
                    if (fLBoolType != null) {
                        voIPPluginApi.setSpeakerEnabled(fLBoolType);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("enabledArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: X */
            public static void m35845X(BinaryMessenger binaryMessenger, VoIPPluginApi voIPPluginApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.accept", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$a(voIPPluginApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.hangUp", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel2.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$c(voIPPluginApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.cancel", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel3.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$o(voIPPluginApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.reject", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel4.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$a0(voIPPluginApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.minimize", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel5.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$k0(voIPPluginApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.switchCamera", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel6.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$l0(voIPPluginApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.switchCameraOpenStatus", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel7.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$m0(voIPPluginApi));
                } else {
                    basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.switchToVoiceMode", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel8.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$n0(voIPPluginApi));
                } else {
                    basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.setMuted", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel9.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$o0(voIPPluginApi));
                } else {
                    basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.setSpeakerEnabled", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel10.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$p0(voIPPluginApi));
                } else {
                    basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getTextureId", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel11.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$l(voIPPluginApi));
                } else {
                    basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.updateTextureSize", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel12.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$w(voIPPluginApi));
                } else {
                    basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.releaseTexture", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel13.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$h0(voIPPluginApi));
                } else {
                    basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.prepareTextures", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel14.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$q0(voIPPluginApi));
                } else {
                    basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getSmallStreamAspectRatio", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel15.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$r0(voIPPluginApi));
                } else {
                    basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isCameraFloatable", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel16.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$s0(voIPPluginApi));
                } else {
                    basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isFrontCamera", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel17.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$t0(voIPPluginApi));
                } else {
                    basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isCameraOn", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel18.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$u0(voIPPluginApi));
                } else {
                    basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getUserInfo", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel19.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$v0(voIPPluginApi));
                } else {
                    basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getConnectedTime", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel20.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$b(voIPPluginApi));
                } else {
                    basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isCaller", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel21.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$d(voIPPluginApi));
                } else {
                    basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isVideoMode", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel22.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$e(voIPPluginApi));
                } else {
                    basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isMuted", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel23.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$f(voIPPluginApi));
                } else {
                    basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getAudioOutputDevice", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel24.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$g(voIPPluginApi));
                } else {
                    basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getStatus", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel25.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$h(voIPPluginApi));
                } else {
                    basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isScreenInteractive", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel26.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$i(voIPPluginApi));
                } else {
                    basicMessageChannel26.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel27 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.onRendered", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel27.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$j(voIPPluginApi));
                } else {
                    basicMessageChannel27.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel28 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.requestRingtoneInfo", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel28.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$k(voIPPluginApi));
                } else {
                    basicMessageChannel28.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel29 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.onClickRingtoneButton", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel29.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$m(voIPPluginApi));
                } else {
                    basicMessageChannel29.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel30 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.setRingtoneSelf", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel30.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$n(voIPPluginApi));
                } else {
                    basicMessageChannel30.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel31 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.getRingStreamType", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel31.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$p(voIPPluginApi));
                } else {
                    basicMessageChannel31.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel32 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.requestRingtoneMute", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel32.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$q(voIPPluginApi));
                } else {
                    basicMessageChannel32.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel33 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.pauseRing", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel33.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$r(voIPPluginApi));
                } else {
                    basicMessageChannel33.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel34 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.resumeRing", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel34.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$s(voIPPluginApi));
                } else {
                    basicMessageChannel34.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel35 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.restartRing", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel35.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$t(voIPPluginApi));
                } else {
                    basicMessageChannel35.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel36 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.reportFps", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel36.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$u(voIPPluginApi));
                } else {
                    basicMessageChannel36.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel37 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.onBooted", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel37.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$v(voIPPluginApi));
                } else {
                    basicMessageChannel37.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel38 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isSplitScreenSupported", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel38.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$x(voIPPluginApi));
                } else {
                    basicMessageChannel38.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel39 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.toggleSplitScreen", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel39.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$y(voIPPluginApi));
                } else {
                    basicMessageChannel39.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel40 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.isScreenSplited", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel40.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$z(voIPPluginApi));
                } else {
                    basicMessageChannel40.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel41 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.checkWeVisonSupport", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel41.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$b0(voIPPluginApi));
                } else {
                    basicMessageChannel41.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel42 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.queryGPURating", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel42.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$c0(voIPPluginApi));
                } else {
                    basicMessageChannel42.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel43 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.setSegmentVirtualBackground", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel43.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$d0(voIPPluginApi));
                } else {
                    basicMessageChannel43.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel44 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.clearVirtualBackground", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel44.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$e0(voIPPluginApi));
                } else {
                    basicMessageChannel44.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel45 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.hideRingtoneHalfDialog", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel45.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$f0(voIPPluginApi));
                } else {
                    basicMessageChannel45.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel46 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.queryAudioRouteInfos", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel46.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$g0(voIPPluginApi));
                } else {
                    basicMessageChannel46.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel47 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.routeToDevice", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel47.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$i0(voIPPluginApi));
                } else {
                    basicMessageChannel47.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel48 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.VoIPPluginApi.queryCurrentAudioRouteInfo", m35846a());
                if (voIPPluginApi != null) {
                    basicMessageChannel48.setMessageHandler(new VoIPFlutterPluginApi$VoIPPluginApi$$j0(voIPPluginApi));
                } else {
                    basicMessageChannel48.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }

            /* renamed from: a */
            public static MessageCodec<Object> m35846a() {
                return VoIPPluginApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m35847b(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    AcceptParams acceptParams = (AcceptParams) ((ArrayList) obj).get(0);
                    if (acceptParams != null) {
                        hashMap.put("result", voIPPluginApi.accept(acceptParams));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("paramsArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: c */
            public static /* synthetic */ void m35848c(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.hangUp();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: d */
            public static /* synthetic */ void m35849d(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLIntType fLIntType = (FLIntType) ((ArrayList) obj).get(0);
                    if (fLIntType != null) {
                        hashMap.put("result", voIPPluginApi.getTextureId(fLIntType));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("typeArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: e */
            public static /* synthetic */ void m35850e(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    UpdateTextureSizeParams updateTextureSizeParams = (UpdateTextureSizeParams) ((ArrayList) obj).get(0);
                    if (updateTextureSizeParams != null) {
                        voIPPluginApi.updateTextureSize(updateTextureSizeParams);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("paramsArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: f */
            public static /* synthetic */ void m35851f(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLIntType fLIntType = (FLIntType) ((ArrayList) obj).get(0);
                    if (fLIntType != null) {
                        voIPPluginApi.releaseTexture(fLIntType);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("idArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: g */
            public static /* synthetic */ void m35852g(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.prepareTextures();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: h */
            public static /* synthetic */ void m35853h(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLBoolType fLBoolType = (FLBoolType) ((ArrayList) obj).get(0);
                    if (fLBoolType != null) {
                        hashMap.put("result", voIPPluginApi.getSmallStreamAspectRatio(fLBoolType));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("isLocalArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: i */
            public static /* synthetic */ void m35854i(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isCameraFloatable());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: j */
            public static /* synthetic */ void m35855j(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isFrontCamera());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: k */
            public static /* synthetic */ void m35856k(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isCameraOn());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: l */
            public static /* synthetic */ void m35857l(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLStringType fLStringType = (FLStringType) ((ArrayList) obj).get(0);
                    if (fLStringType != null) {
                        hashMap.put("result", voIPPluginApi.getUserInfo(fLStringType));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("usernameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: m */
            public static /* synthetic */ void m35858m(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.getConnectedTime());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: n */
            public static /* synthetic */ void m35859n(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.cancel());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: o */
            public static /* synthetic */ void m35860o(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isCaller());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: p */
            public static /* synthetic */ void m35861p(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isVideoMode());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: q */
            public static /* synthetic */ void m35862q(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isMuted());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: r */
            public static /* synthetic */ void m35863r(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.getAudioOutputDevice());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: s */
            public static /* synthetic */ void m35864s(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.getStatus());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: t */
            public static /* synthetic */ void m35865t(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.isScreenInteractive());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: u */
            public static /* synthetic */ void m35866u(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.onRendered();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: v */
            public static /* synthetic */ void m35867v(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLStringType fLStringType = (FLStringType) ((ArrayList) obj).get(0);
                    if (fLStringType != null) {
                        voIPPluginApi.requestRingtoneInfo(fLStringType);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("usernameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
            }

            /* renamed from: w */
            public static /* synthetic */ void m35868w(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    voIPPluginApi.onClickRingtoneButton();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: x */
            public static /* synthetic */ void m35869x(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FLStringType fLStringType = (FLStringType) ((ArrayList) obj).get(0);
                    if (fLStringType != null) {
                        voIPPluginApi.setRingtoneSelf(fLStringType, new Result<FLBoolType>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", VoIPFlutterPluginApi.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(FLBoolType fLBoolType) {
                                this.val$wrapped.put("result", fLBoolType);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("usernameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: y */
            public static /* synthetic */ void m35870y(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.reject());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: z */
            public static /* synthetic */ void m35871z(VoIPPluginApi voIPPluginApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", voIPPluginApi.getRingStreamType());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
                }
                reply.reply(hashMap);
            }
        }

        FLBoolType accept(AcceptParams acceptParams);

        FLBoolType cancel();

        Boolean checkWeVisonSupport();

        void clearVirtualBackground(Boolean bool);

        FLIntType getAudioOutputDevice();

        FLIntType getConnectedTime();

        FLIntType getRingStreamType();

        FLDoubleType getSmallStreamAspectRatio(FLBoolType fLBoolType);

        FLIntType getStatus();

        FLIntType getTextureId(FLIntType fLIntType);

        UserInfoParams getUserInfo(FLStringType fLStringType);

        void hangUp();

        void hideRingtoneHalfDialog();

        FLBoolType isCaller();

        FLBoolType isCameraFloatable();

        FLBoolType isCameraOn();

        FLBoolType isFrontCamera();

        FLBoolType isMuted();

        FLBoolType isScreenInteractive();

        FLBoolType isScreenSplited();

        FLBoolType isSplitScreenSupported();

        FLBoolType isVideoMode();

        void minimize(MinimizeParams minimizeParams, Result<FLBoolType> result);

        void onBooted();

        void onClickRingtoneButton();

        void onRendered();

        void pauseRing();

        void prepareTextures();

        List<AudioRouteInfo> queryAudioRouteInfos();

        AudioRouteInfo queryCurrentAudioRouteInfo();

        Long queryGPURating();

        FLBoolType reject();

        void releaseTexture(FLIntType fLIntType);

        void reportFps(FpsParams fpsParams);

        void requestRingtoneInfo(FLStringType fLStringType);

        void requestRingtoneMute(FLBoolType fLBoolType);

        void restartRing();

        void resumeRing();

        Boolean routeToDevice(AudioRouteInfo audioRouteInfo);

        void setMuted(FLBoolType fLBoolType);

        void setRingtoneSelf(FLStringType fLStringType, Result<FLBoolType> result);

        void setSegmentVirtualBackground(Long l);

        void setSpeakerEnabled(FLBoolType fLBoolType);

        void switchCamera(Result<FLBoolType> result);

        void switchCameraOpenStatus(Result<FLBoolType> result);

        FLBoolType switchToVoiceMode();

        void toggleSplitScreen();

        void updateTextureSize(UpdateTextureSizeParams updateTextureSizeParams);
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static class AcceptParams {
        private Boolean needSwitchToVoice;

        public static final class Builder {
            private Boolean needSwitchToVoice;

            public AcceptParams build() {
                AcceptParams acceptParams = new AcceptParams();
                acceptParams.setNeedSwitchToVoice(this.needSwitchToVoice);
                return acceptParams;
            }

            public Builder setNeedSwitchToVoice(Boolean bool) {
                this.needSwitchToVoice = bool;
                return this;
            }
        }

        private AcceptParams() {
        }

        public static AcceptParams fromMap(Map<String, Object> map) {
            AcceptParams acceptParams = new AcceptParams();
            acceptParams.setNeedSwitchToVoice((Boolean) map.get("needSwitchToVoice"));
            return acceptParams;
        }

        public Boolean getNeedSwitchToVoice() {
            return this.needSwitchToVoice;
        }

        public void setNeedSwitchToVoice(Boolean bool) {
            if (bool != null) {
                this.needSwitchToVoice = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"needSwitchToVoice\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("needSwitchToVoice", this.needSwitchToVoice);
            return hashMap;
        }
    }

    public enum AudioDevice {
        speaker(0),
        earpiece(1),
        headset(2),
        bluetooth(3);
        
        /* access modifiers changed from: private */
        public int index;

        private AudioDevice(int i) {
            this.index = i;
        }
    }

    public static class AudioRouteInfo {
        private String deviceName;
        private AudioDevice deviceType;

        public static final class Builder {
            private String deviceName;
            private AudioDevice deviceType;

            public AudioRouteInfo build() {
                AudioRouteInfo audioRouteInfo = new AudioRouteInfo();
                audioRouteInfo.setDeviceType(this.deviceType);
                audioRouteInfo.setDeviceName(this.deviceName);
                return audioRouteInfo;
            }

            public Builder setDeviceName(String str) {
                this.deviceName = str;
                return this;
            }

            public Builder setDeviceType(AudioDevice audioDevice) {
                this.deviceType = audioDevice;
                return this;
            }
        }

        private AudioRouteInfo() {
        }

        public static AudioRouteInfo fromMap(Map<String, Object> map) {
            AudioRouteInfo audioRouteInfo = new AudioRouteInfo();
            Object obj = map.get("deviceType");
            audioRouteInfo.setDeviceType(obj == null ? null : AudioDevice.values()[((Integer) obj).intValue()]);
            audioRouteInfo.setDeviceName((String) map.get(MJTextResolver.KEY_DEVICE_NAME));
            return audioRouteInfo;
        }

        public String getDeviceName() {
            return this.deviceName;
        }

        public AudioDevice getDeviceType() {
            return this.deviceType;
        }

        public void setDeviceName(String str) {
            if (str != null) {
                this.deviceName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"deviceName\" is null.");
        }

        public void setDeviceType(AudioDevice audioDevice) {
            if (audioDevice != null) {
                this.deviceType = audioDevice;
                return;
            }
            throw new IllegalStateException("Nonnull field \"deviceType\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            AudioDevice audioDevice = this.deviceType;
            hashMap.put("deviceType", audioDevice == null ? null : Integer.valueOf(audioDevice.index));
            hashMap.put(MJTextResolver.KEY_DEVICE_NAME, this.deviceName);
            return hashMap;
        }
    }

    public static class EventParams {
        private String message;
        private Long type;

        public static final class Builder {
            private String message;
            private Long type;

            public EventParams build() {
                EventParams eventParams = new EventParams();
                eventParams.setType(this.type);
                eventParams.setMessage(this.message);
                return eventParams;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }

            public Builder setType(Long l) {
                this.type = l;
                return this;
            }
        }

        private EventParams() {
        }

        public static EventParams fromMap(Map<String, Object> map) {
            Long l;
            EventParams eventParams = new EventParams();
            Object obj = map.get("type");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eventParams.setType(l);
            eventParams.setMessage((String) map.get(StateEvent.Name.MESSAGE));
            return eventParams;
        }

        public String getMessage() {
            return this.message;
        }

        public Long getType() {
            return this.type;
        }

        public void setMessage(String str) {
            if (str != null) {
                this.message = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"message\" is null.");
        }

        public void setType(Long l) {
            if (l != null) {
                this.type = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("type", this.type);
            hashMap.put(StateEvent.Name.MESSAGE, this.message);
            return hashMap;
        }
    }

    public static class FLBoolType {
        private Boolean value;

        public static final class Builder {
            private Boolean value;

            public FLBoolType build() {
                FLBoolType fLBoolType = new FLBoolType();
                fLBoolType.setValue(this.value);
                return fLBoolType;
            }

            public Builder setValue(Boolean bool) {
                this.value = bool;
                return this;
            }
        }

        private FLBoolType() {
        }

        public static FLBoolType fromMap(Map<String, Object> map) {
            FLBoolType fLBoolType = new FLBoolType();
            fLBoolType.setValue((Boolean) map.get("value"));
            return fLBoolType;
        }

        public Boolean getValue() {
            return this.value;
        }

        public void setValue(Boolean bool) {
            if (bool != null) {
                this.value = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FLDoubleType {
        private Double value;

        public static final class Builder {
            private Double value;

            public FLDoubleType build() {
                FLDoubleType fLDoubleType = new FLDoubleType();
                fLDoubleType.setValue(this.value);
                return fLDoubleType;
            }

            public Builder setValue(Double d) {
                this.value = d;
                return this;
            }
        }

        private FLDoubleType() {
        }

        public static FLDoubleType fromMap(Map<String, Object> map) {
            FLDoubleType fLDoubleType = new FLDoubleType();
            fLDoubleType.setValue((Double) map.get("value"));
            return fLDoubleType;
        }

        public Double getValue() {
            return this.value;
        }

        public void setValue(Double d) {
            if (d != null) {
                this.value = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FLIntType {
        private Long value;

        public static final class Builder {
            private Long value;

            public FLIntType build() {
                FLIntType fLIntType = new FLIntType();
                fLIntType.setValue(this.value);
                return fLIntType;
            }

            public Builder setValue(Long l) {
                this.value = l;
                return this;
            }
        }

        private FLIntType() {
        }

        public static FLIntType fromMap(Map<String, Object> map) {
            Long l;
            FLIntType fLIntType = new FLIntType();
            Object obj = map.get("value");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fLIntType.setValue(l);
            return fLIntType;
        }

        public Long getValue() {
            return this.value;
        }

        public void setValue(Long l) {
            if (l != null) {
                this.value = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FLRoomInfo {
        private Long roomId;
        private Long roomKey;

        public static final class Builder {
            private Long roomId;
            private Long roomKey;

            public FLRoomInfo build() {
                FLRoomInfo fLRoomInfo = new FLRoomInfo();
                fLRoomInfo.setRoomId(this.roomId);
                fLRoomInfo.setRoomKey(this.roomKey);
                return fLRoomInfo;
            }

            public Builder setRoomId(Long l) {
                this.roomId = l;
                return this;
            }

            public Builder setRoomKey(Long l) {
                this.roomKey = l;
                return this;
            }
        }

        private FLRoomInfo() {
        }

        public static FLRoomInfo fromMap(Map<String, Object> map) {
            Long l;
            FLRoomInfo fLRoomInfo = new FLRoomInfo();
            Object obj = map.get("roomId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fLRoomInfo.setRoomId(l);
            Object obj2 = map.get("roomKey");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            fLRoomInfo.setRoomKey(l2);
            return fLRoomInfo;
        }

        public Long getRoomId() {
            return this.roomId;
        }

        public Long getRoomKey() {
            return this.roomKey;
        }

        public void setRoomId(Long l) {
            if (l != null) {
                this.roomId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"roomId\" is null.");
        }

        public void setRoomKey(Long l) {
            if (l != null) {
                this.roomKey = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"roomKey\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("roomId", this.roomId);
            hashMap.put("roomKey", this.roomKey);
            return hashMap;
        }
    }

    public static class FLStringType {
        private String value;

        public static final class Builder {
            private String value;

            public FLStringType build() {
                FLStringType fLStringType = new FLStringType();
                fLStringType.setValue(this.value);
                return fLStringType;
            }

            public Builder setValue(String str) {
                this.value = str;
                return this;
            }
        }

        private FLStringType() {
        }

        public static FLStringType fromMap(Map<String, Object> map) {
            FLStringType fLStringType = new FLStringType();
            fLStringType.setValue((String) map.get("value"));
            return fLStringType;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            if (str != null) {
                this.value = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FLTextureInfo {
        private Long height;
        private Boolean mirror;
        private Long quarterTurns;
        private Long textureId;
        private Long width;

        public static final class Builder {
            private Long height;
            private Boolean mirror;
            private Long quarterTurns;
            private Long textureId;
            private Long width;

            public FLTextureInfo build() {
                FLTextureInfo fLTextureInfo = new FLTextureInfo();
                fLTextureInfo.setTextureId(this.textureId);
                fLTextureInfo.setWidth(this.width);
                fLTextureInfo.setHeight(this.height);
                fLTextureInfo.setQuarterTurns(this.quarterTurns);
                fLTextureInfo.setMirror(this.mirror);
                return fLTextureInfo;
            }

            public Builder setHeight(Long l) {
                this.height = l;
                return this;
            }

            public Builder setMirror(Boolean bool) {
                this.mirror = bool;
                return this;
            }

            public Builder setQuarterTurns(Long l) {
                this.quarterTurns = l;
                return this;
            }

            public Builder setTextureId(Long l) {
                this.textureId = l;
                return this;
            }

            public Builder setWidth(Long l) {
                this.width = l;
                return this;
            }
        }

        private FLTextureInfo() {
        }

        public static FLTextureInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            FLTextureInfo fLTextureInfo = new FLTextureInfo();
            Object obj = map.get("textureId");
            Long l4 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fLTextureInfo.setTextureId(l);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            fLTextureInfo.setWidth(l2);
            Object obj3 = map.get("height");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            fLTextureInfo.setHeight(l3);
            Object obj4 = map.get("quarterTurns");
            if (obj4 != null) {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            fLTextureInfo.setQuarterTurns(l4);
            fLTextureInfo.setMirror((Boolean) map.get(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR));
            return fLTextureInfo;
        }

        public Long getHeight() {
            return this.height;
        }

        public Boolean getMirror() {
            return this.mirror;
        }

        public Long getQuarterTurns() {
            return this.quarterTurns;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public Long getWidth() {
            return this.width;
        }

        public void setHeight(Long l) {
            if (l != null) {
                this.height = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }

        public void setMirror(Boolean bool) {
            if (bool != null) {
                this.mirror = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mirror\" is null.");
        }

        public void setQuarterTurns(Long l) {
            if (l != null) {
                this.quarterTurns = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"quarterTurns\" is null.");
        }

        public void setTextureId(Long l) {
            if (l != null) {
                this.textureId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        public void setWidth(Long l) {
            if (l != null) {
                this.width = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.textureId);
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            hashMap.put("quarterTurns", this.quarterTurns);
            hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, this.mirror);
            return hashMap;
        }
    }

    public static class FinderFeedLaunchRequest {
        private Long feedId;
        private Boolean fromRingtone;
        private String nonceId;

        public static final class Builder {
            private Long feedId;
            private Boolean fromRingtone;
            private String nonceId;

            public FinderFeedLaunchRequest build() {
                FinderFeedLaunchRequest finderFeedLaunchRequest = new FinderFeedLaunchRequest();
                finderFeedLaunchRequest.setFeedId(this.feedId);
                finderFeedLaunchRequest.setNonceId(this.nonceId);
                finderFeedLaunchRequest.setFromRingtone(this.fromRingtone);
                return finderFeedLaunchRequest;
            }

            public Builder setFeedId(Long l) {
                this.feedId = l;
                return this;
            }

            public Builder setFromRingtone(Boolean bool) {
                this.fromRingtone = bool;
                return this;
            }

            public Builder setNonceId(String str) {
                this.nonceId = str;
                return this;
            }
        }

        private FinderFeedLaunchRequest() {
        }

        public static FinderFeedLaunchRequest fromMap(Map<String, Object> map) {
            Long l;
            FinderFeedLaunchRequest finderFeedLaunchRequest = new FinderFeedLaunchRequest();
            Object obj = map.get("feedId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            finderFeedLaunchRequest.setFeedId(l);
            finderFeedLaunchRequest.setNonceId((String) map.get("nonceId"));
            finderFeedLaunchRequest.setFromRingtone((Boolean) map.get("fromRingtone"));
            return finderFeedLaunchRequest;
        }

        public Long getFeedId() {
            return this.feedId;
        }

        public Boolean getFromRingtone() {
            return this.fromRingtone;
        }

        public String getNonceId() {
            return this.nonceId;
        }

        public void setFeedId(Long l) {
            if (l != null) {
                this.feedId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"feedId\" is null.");
        }

        public void setFromRingtone(Boolean bool) {
            if (bool != null) {
                this.fromRingtone = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fromRingtone\" is null.");
        }

        public void setNonceId(String str) {
            if (str != null) {
                this.nonceId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"nonceId\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("feedId", this.feedId);
            hashMap.put("nonceId", this.nonceId);
            hashMap.put("fromRingtone", this.fromRingtone);
            return hashMap;
        }
    }

    public static class FpsParams {
        private Double slowFrameRate;

        public static final class Builder {
            private Double slowFrameRate;

            public FpsParams build() {
                FpsParams fpsParams = new FpsParams();
                fpsParams.setSlowFrameRate(this.slowFrameRate);
                return fpsParams;
            }

            public Builder setSlowFrameRate(Double d) {
                this.slowFrameRate = d;
                return this;
            }
        }

        private FpsParams() {
        }

        public static FpsParams fromMap(Map<String, Object> map) {
            FpsParams fpsParams = new FpsParams();
            fpsParams.setSlowFrameRate((Double) map.get("slowFrameRate"));
            return fpsParams;
        }

        public Double getSlowFrameRate() {
            return this.slowFrameRate;
        }

        public void setSlowFrameRate(Double d) {
            if (d != null) {
                this.slowFrameRate = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"slowFrameRate\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("slowFrameRate", this.slowFrameRate);
            return hashMap;
        }
    }

    public static class MinimizeParams {
        private Boolean needAnimation;
        private Boolean needPop;
        private Boolean showAlertIfNoPermission;

        public static final class Builder {
            private Boolean needAnimation;
            private Boolean needPop;
            private Boolean showAlertIfNoPermission;

            public MinimizeParams build() {
                MinimizeParams minimizeParams = new MinimizeParams();
                minimizeParams.setShowAlertIfNoPermission(this.showAlertIfNoPermission);
                minimizeParams.setNeedPop(this.needPop);
                minimizeParams.setNeedAnimation(this.needAnimation);
                return minimizeParams;
            }

            public Builder setNeedAnimation(Boolean bool) {
                this.needAnimation = bool;
                return this;
            }

            public Builder setNeedPop(Boolean bool) {
                this.needPop = bool;
                return this;
            }

            public Builder setShowAlertIfNoPermission(Boolean bool) {
                this.showAlertIfNoPermission = bool;
                return this;
            }
        }

        private MinimizeParams() {
        }

        public static MinimizeParams fromMap(Map<String, Object> map) {
            MinimizeParams minimizeParams = new MinimizeParams();
            minimizeParams.setShowAlertIfNoPermission((Boolean) map.get("showAlertIfNoPermission"));
            minimizeParams.setNeedPop((Boolean) map.get("needPop"));
            minimizeParams.setNeedAnimation((Boolean) map.get("needAnimation"));
            return minimizeParams;
        }

        public Boolean getNeedAnimation() {
            return this.needAnimation;
        }

        public Boolean getNeedPop() {
            return this.needPop;
        }

        public Boolean getShowAlertIfNoPermission() {
            return this.showAlertIfNoPermission;
        }

        public void setNeedAnimation(Boolean bool) {
            if (bool != null) {
                this.needAnimation = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"needAnimation\" is null.");
        }

        public void setNeedPop(Boolean bool) {
            if (bool != null) {
                this.needPop = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"needPop\" is null.");
        }

        public void setShowAlertIfNoPermission(Boolean bool) {
            if (bool != null) {
                this.showAlertIfNoPermission = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"showAlertIfNoPermission\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("showAlertIfNoPermission", this.showAlertIfNoPermission);
            hashMap.put("needPop", this.needPop);
            hashMap.put("needAnimation", this.needAnimation);
            return hashMap;
        }
    }

    public static class RingtoneInfo {
        private String cover;
        private Long feedId;
        private String nonceId;
        private String singerName;
        private String title;
        private String vendor;

        public static final class Builder {
            private String cover;
            private Long feedId;
            private String nonceId;
            private String singerName;
            private String title;
            private String vendor;

            public RingtoneInfo build() {
                RingtoneInfo ringtoneInfo = new RingtoneInfo();
                ringtoneInfo.setCover(this.cover);
                ringtoneInfo.setTitle(this.title);
                ringtoneInfo.setSingerName(this.singerName);
                ringtoneInfo.setVendor(this.vendor);
                ringtoneInfo.setFeedId(this.feedId);
                ringtoneInfo.setNonceId(this.nonceId);
                return ringtoneInfo;
            }

            public Builder setCover(String str) {
                this.cover = str;
                return this;
            }

            public Builder setFeedId(Long l) {
                this.feedId = l;
                return this;
            }

            public Builder setNonceId(String str) {
                this.nonceId = str;
                return this;
            }

            public Builder setSingerName(String str) {
                this.singerName = str;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setVendor(String str) {
                this.vendor = str;
                return this;
            }
        }

        private RingtoneInfo() {
        }

        public static RingtoneInfo fromMap(Map<String, Object> map) {
            Long l;
            RingtoneInfo ringtoneInfo = new RingtoneInfo();
            ringtoneInfo.setCover((String) map.get("cover"));
            ringtoneInfo.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            ringtoneInfo.setSingerName((String) map.get("singerName"));
            ringtoneInfo.setVendor((String) map.get("vendor"));
            Object obj = map.get("feedId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            ringtoneInfo.setFeedId(l);
            ringtoneInfo.setNonceId((String) map.get("nonceId"));
            return ringtoneInfo;
        }

        public String getCover() {
            return this.cover;
        }

        public Long getFeedId() {
            return this.feedId;
        }

        public String getNonceId() {
            return this.nonceId;
        }

        public String getSingerName() {
            return this.singerName;
        }

        public String getTitle() {
            return this.title;
        }

        public String getVendor() {
            return this.vendor;
        }

        public void setCover(String str) {
            if (str != null) {
                this.cover = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"cover\" is null.");
        }

        public void setFeedId(Long l) {
            if (l != null) {
                this.feedId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"feedId\" is null.");
        }

        public void setNonceId(String str) {
            if (str != null) {
                this.nonceId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"nonceId\" is null.");
        }

        public void setSingerName(String str) {
            if (str != null) {
                this.singerName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"singerName\" is null.");
        }

        public void setTitle(String str) {
            if (str != null) {
                this.title = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"title\" is null.");
        }

        public void setVendor(String str) {
            if (str != null) {
                this.vendor = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"vendor\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("cover", this.cover);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("singerName", this.singerName);
            hashMap.put("vendor", this.vendor);
            hashMap.put("feedId", this.feedId);
            hashMap.put("nonceId", this.nonceId);
            return hashMap;
        }
    }

    public interface RouterPluginApi {
        void launchDoubleLinkSettings();

        void launchFinderFeed(FinderFeedLaunchRequest finderFeedLaunchRequest);

        void launchSnsPost(SnsPostLaunchRequest snsPostLaunchRequest);

        void launchUserProfile(UserProfileLaunchRequest userProfileLaunchRequest);
    }

    public static class RouterPluginApiCodec extends StandardMessageCodec {
        public static final RouterPluginApiCodec INSTANCE = new RouterPluginApiCodec();

        private RouterPluginApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return FinderFeedLaunchRequest.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return SnsPostLaunchRequest.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return UserProfileLaunchRequest.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FinderFeedLaunchRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FinderFeedLaunchRequest) obj).toMap());
            } else if (obj instanceof SnsPostLaunchRequest) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((SnsPostLaunchRequest) obj).toMap());
            } else if (obj instanceof UserProfileLaunchRequest) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((UserProfileLaunchRequest) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class SnsPostLaunchRequest {
        private String localId;
        private String username;

        public static final class Builder {
            private String localId;
            private String username;

            public SnsPostLaunchRequest build() {
                SnsPostLaunchRequest snsPostLaunchRequest = new SnsPostLaunchRequest();
                snsPostLaunchRequest.setUsername(this.username);
                snsPostLaunchRequest.setLocalId(this.localId);
                return snsPostLaunchRequest;
            }

            public Builder setLocalId(String str) {
                this.localId = str;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        private SnsPostLaunchRequest() {
        }

        public static SnsPostLaunchRequest fromMap(Map<String, Object> map) {
            SnsPostLaunchRequest snsPostLaunchRequest = new SnsPostLaunchRequest();
            snsPostLaunchRequest.setUsername((String) map.get("username"));
            snsPostLaunchRequest.setLocalId((String) map.get(C66261f3.COL_LOCALID));
            return snsPostLaunchRequest;
        }

        public String getLocalId() {
            return this.localId;
        }

        public String getUsername() {
            return this.username;
        }

        public void setLocalId(String str) {
            if (str != null) {
                this.localId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"localId\" is null.");
        }

        public void setUsername(String str) {
            if (str != null) {
                this.username = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"username\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put(C66261f3.COL_LOCALID, this.localId);
            return hashMap;
        }
    }

    public static class UpdateTextureSizeParams {
        private Long height;
        private Long textureId;
        private Long width;

        public static final class Builder {
            private Long height;
            private Long textureId;
            private Long width;

            public UpdateTextureSizeParams build() {
                UpdateTextureSizeParams updateTextureSizeParams = new UpdateTextureSizeParams();
                updateTextureSizeParams.setTextureId(this.textureId);
                updateTextureSizeParams.setWidth(this.width);
                updateTextureSizeParams.setHeight(this.height);
                return updateTextureSizeParams;
            }

            public Builder setHeight(Long l) {
                this.height = l;
                return this;
            }

            public Builder setTextureId(Long l) {
                this.textureId = l;
                return this;
            }

            public Builder setWidth(Long l) {
                this.width = l;
                return this;
            }
        }

        private UpdateTextureSizeParams() {
        }

        public static UpdateTextureSizeParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            UpdateTextureSizeParams updateTextureSizeParams = new UpdateTextureSizeParams();
            Object obj = map.get("textureId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            updateTextureSizeParams.setTextureId(l);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            updateTextureSizeParams.setWidth(l2);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            updateTextureSizeParams.setHeight(l3);
            return updateTextureSizeParams;
        }

        public Long getHeight() {
            return this.height;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public Long getWidth() {
            return this.width;
        }

        public void setHeight(Long l) {
            if (l != null) {
                this.height = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }

        public void setTextureId(Long l) {
            if (l != null) {
                this.textureId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        public void setWidth(Long l) {
            if (l != null) {
                this.width = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.textureId);
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            return hashMap;
        }
    }

    public static class UserInfoParams {
        private String avatarPath;
        private String displayName;
        private String gender;
        private Boolean isOpenIM;
        private String subName;
        private String username;

        public static final class Builder {
            private String avatarPath;
            private String displayName;
            private String gender;
            private Boolean isOpenIM;
            private String subName;
            private String username;

            public UserInfoParams build() {
                UserInfoParams userInfoParams = new UserInfoParams();
                userInfoParams.setUsername(this.username);
                userInfoParams.setAvatarPath(this.avatarPath);
                userInfoParams.setDisplayName(this.displayName);
                userInfoParams.setGender(this.gender);
                userInfoParams.setIsOpenIM(this.isOpenIM);
                userInfoParams.setSubName(this.subName);
                return userInfoParams;
            }

            public Builder setAvatarPath(String str) {
                this.avatarPath = str;
                return this;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setGender(String str) {
                this.gender = str;
                return this;
            }

            public Builder setIsOpenIM(Boolean bool) {
                this.isOpenIM = bool;
                return this;
            }

            public Builder setSubName(String str) {
                this.subName = str;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        private UserInfoParams() {
        }

        public static UserInfoParams fromMap(Map<String, Object> map) {
            UserInfoParams userInfoParams = new UserInfoParams();
            userInfoParams.setUsername((String) map.get("username"));
            userInfoParams.setAvatarPath((String) map.get("avatarPath"));
            userInfoParams.setDisplayName((String) map.get("displayName"));
            userInfoParams.setGender((String) map.get("gender"));
            userInfoParams.setIsOpenIM((Boolean) map.get("isOpenIM"));
            userInfoParams.setSubName((String) map.get("subName"));
            return userInfoParams;
        }

        public String getAvatarPath() {
            return this.avatarPath;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getGender() {
            return this.gender;
        }

        public Boolean getIsOpenIM() {
            return this.isOpenIM;
        }

        public String getSubName() {
            return this.subName;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAvatarPath(String str) {
            if (str != null) {
                this.avatarPath = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"avatarPath\" is null.");
        }

        public void setDisplayName(String str) {
            if (str != null) {
                this.displayName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"displayName\" is null.");
        }

        public void setGender(String str) {
            if (str != null) {
                this.gender = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"gender\" is null.");
        }

        public void setIsOpenIM(Boolean bool) {
            if (bool != null) {
                this.isOpenIM = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isOpenIM\" is null.");
        }

        public void setSubName(String str) {
            if (str != null) {
                this.subName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"subName\" is null.");
        }

        public void setUsername(String str) {
            if (str != null) {
                this.username = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"username\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("avatarPath", this.avatarPath);
            hashMap.put("displayName", this.displayName);
            hashMap.put("gender", this.gender);
            hashMap.put("isOpenIM", this.isOpenIM);
            hashMap.put("subName", this.subName);
            return hashMap;
        }
    }

    public static class UserProfileLaunchRequest {
        private String username;

        public static final class Builder {
            private String username;

            public UserProfileLaunchRequest build() {
                UserProfileLaunchRequest userProfileLaunchRequest = new UserProfileLaunchRequest();
                userProfileLaunchRequest.setUsername(this.username);
                return userProfileLaunchRequest;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        private UserProfileLaunchRequest() {
        }

        public static UserProfileLaunchRequest fromMap(Map<String, Object> map) {
            UserProfileLaunchRequest userProfileLaunchRequest = new UserProfileLaunchRequest();
            userProfileLaunchRequest.setUsername((String) map.get("username"));
            return userProfileLaunchRequest;
        }

        public String getUsername() {
            return this.username;
        }

        public void setUsername(String str) {
            if (str != null) {
                this.username = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"username\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            return hashMap;
        }
    }

    public static class VoIPFlutterApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public VoIPFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return VoIPFlutterApiCodec.INSTANCE;
        }

        public void onAccepted(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onAccepted", getCodec()).send(null, new VoIPFlutterPluginApi$VoIPFlutterApi$$o(reply));
        }

        public void onAudioOutputDeviceChanged(AudioRouteInfo audioRouteInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onAudioOutputDeviceChanged", getCodec()).send(new ArrayList(Arrays.asList(new AudioRouteInfo[]{audioRouteInfo})), new VoIPFlutterPluginApi$VoIPFlutterApi$$a(reply));
        }

        public void onCompleted(FLIntType fLIntType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onCompleted", getCodec()).send(new ArrayList(Arrays.asList(new FLIntType[]{fLIntType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$p(reply));
        }

        public void onConnected(FLIntType fLIntType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onConnected", getCodec()).send(new ArrayList(Arrays.asList(new FLIntType[]{fLIntType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$g(reply));
        }

        public void onDevicePhysicalOrientationChanged(Long l, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onDevicePhysicalOrientationChanged", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l})), new VoIPFlutterPluginApi$VoIPFlutterApi$$n(reply));
        }

        public void onError(FLIntType fLIntType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onError", getCodec()).send(new ArrayList(Arrays.asList(new FLIntType[]{fLIntType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$s(reply));
        }

        public void onEvent(EventParams eventParams, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onEvent", getCodec()).send(new ArrayList(Arrays.asList(new EventParams[]{eventParams})), new VoIPFlutterPluginApi$VoIPFlutterApi$$m(reply));
        }

        public void onExternalAudioOutputDeviceChanged(List<AudioRouteInfo> list, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onExternalAudioOutputDeviceChanged", getCodec()).send(new ArrayList(Arrays.asList(new List[]{list})), new VoIPFlutterPluginApi$VoIPFlutterApi$$l(reply));
        }

        public void onMinCardAcceptCall(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onMinCardAcceptCall", getCodec()).send(null, new VoIPFlutterPluginApi$VoIPFlutterApi$$j(reply));
        }

        public void onMinCardHangup(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onMinCardHangup", getCodec()).send(null, new VoIPFlutterPluginApi$VoIPFlutterApi$$q(reply));
        }

        public void onMinimized(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onMinimized", getCodec()).send(null, new VoIPFlutterPluginApi$VoIPFlutterApi$$c(reply));
        }

        public void onModeChanged(FLBoolType fLBoolType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onModeChanged", getCodec()).send(new ArrayList(Arrays.asList(new FLBoolType[]{fLBoolType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$f(reply));
        }

        public void onRespond(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onRespond", getCodec()).send(null, new VoIPFlutterPluginApi$VoIPFlutterApi$$i(reply));
        }

        public void onRoomReady(FLRoomInfo fLRoomInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onRoomReady", getCodec()).send(new ArrayList(Arrays.asList(new FLRoomInfo[]{fLRoomInfo})), new VoIPFlutterPluginApi$VoIPFlutterApi$$e(reply));
        }

        public void onScreenStateChanged(FLBoolType fLBoolType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onScreenStateChanged", getCodec()).send(new ArrayList(Arrays.asList(new FLBoolType[]{fLBoolType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$r(reply));
        }

        public void onSystemRotateLockChanged(Boolean bool, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onSystemRotateLockChanged", getCodec()).send(new ArrayList(Arrays.asList(new Boolean[]{bool})), new VoIPFlutterPluginApi$VoIPFlutterApi$$b(reply));
        }

        public void onTextureInfoChanged(FLTextureInfo fLTextureInfo, Reply<Boolean> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.onTextureInfoChanged", getCodec()).send(new ArrayList(Arrays.asList(new FLTextureInfo[]{fLTextureInfo})), new VoIPFlutterPluginApi$VoIPFlutterApi$$k(reply));
        }

        public void resetMinCardMode(FLBoolType fLBoolType, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.resetMinCardMode", getCodec()).send(new ArrayList(Arrays.asList(new FLBoolType[]{fLBoolType})), new VoIPFlutterPluginApi$VoIPFlutterApi$$d(reply));
        }

        public void responseRingtoneInfo(RingtoneInfo ringtoneInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.VoIPFlutterApi.responseRingtoneInfo", getCodec()).send(new ArrayList(Arrays.asList(new RingtoneInfo[]{ringtoneInfo})), new VoIPFlutterPluginApi$VoIPFlutterApi$$h(reply));
        }
    }

    public static class VoIPFlutterApiCodec extends StandardMessageCodec {
        public static final VoIPFlutterApiCodec INSTANCE = new VoIPFlutterApiCodec();

        private VoIPFlutterApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return AudioRouteInfo.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return EventParams.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FLBoolType.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return FLIntType.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return FLRoomInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return FLTextureInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                    return RingtoneInfo.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AudioRouteInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AudioRouteInfo) obj).toMap());
            } else if (obj instanceof EventParams) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((EventParams) obj).toMap());
            } else if (obj instanceof FLBoolType) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FLBoolType) obj).toMap());
            } else if (obj instanceof FLIntType) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((FLIntType) obj).toMap());
            } else if (obj instanceof FLRoomInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((FLRoomInfo) obj).toMap());
            } else if (obj instanceof FLTextureInfo) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((FLTextureInfo) obj).toMap());
            } else if (obj instanceof RingtoneInfo) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((RingtoneInfo) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class VoIPPluginApiCodec extends StandardMessageCodec {
        public static final VoIPPluginApiCodec INSTANCE = new VoIPPluginApiCodec();

        private VoIPPluginApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return AcceptParams.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return AudioRouteInfo.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FLBoolType.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return FLDoubleType.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return FLIntType.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return FLStringType.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                    return FpsParams.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_VIDEO_SAMPLE /*-121*/:
                    return MinimizeParams.fromMap((Map) readValue(byteBuffer));
                case -120:
                    return UpdateTextureSizeParams.fromMap((Map) readValue(byteBuffer));
                case -119:
                    return UserInfoParams.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AcceptParams) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AcceptParams) obj).toMap());
            } else if (obj instanceof AudioRouteInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((AudioRouteInfo) obj).toMap());
            } else if (obj instanceof FLBoolType) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FLBoolType) obj).toMap());
            } else if (obj instanceof FLDoubleType) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((FLDoubleType) obj).toMap());
            } else if (obj instanceof FLIntType) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((FLIntType) obj).toMap());
            } else if (obj instanceof FLStringType) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((FLStringType) obj).toMap());
            } else if (obj instanceof FpsParams) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((FpsParams) obj).toMap());
            } else if (obj instanceof MinimizeParams) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((MinimizeParams) obj).toMap());
            } else if (obj instanceof UpdateTextureSizeParams) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((UpdateTextureSizeParams) obj).toMap());
            } else if (obj instanceof UserInfoParams) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((UserInfoParams) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
