package q50;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.rtmp.TXLiveConstants;

/* renamed from: q50.a */
public final class C62581a {

    /* renamed from: a */
    public static final C62581a f177735a = new C62581a();

    /* renamed from: a */
    public final String mo87638a(int i) {
        if (i == 0) {
            return "无错误";
        }
        if (i == -1328) {
            return "设置的 buffer type 不支持";
        }
        if (i == -1327) {
            return "设置的 pixel format 不支持";
        }
        switch (i) {
            case -102015:
                return "没有权限上行辅路";
            case -100013:
                return "服务不可用。请检查：套餐包剩余分钟数是否大于0，腾讯云账号是否欠费";
            case -3330:
                return "当前是观众角色，不能请求或断开跨房连麦，需要先 switchRole() 到主播";
            case -3308:
                return "请求进房超时，请检查网络";
            case -3301:
                return "进入房间失败";
            case TXLiveConstants.PLAY_ERR_NET_DISCONNECT:
                return "直播，网络断连，且经多次重连抢救无效，可以放弃治疗，更多重试请自行重启播放";
            case TXLiteAVCode.ERR_SPEAKER_STOP_FAIL /*-1323*/:
                return "停止扬声器失败";
            case TXLiteAVCode.ERR_SPEAKER_SET_PARAM_FAIL /*-1322*/:
                return "扬声器设置参数失败";
            case TXLiteAVCode.ERR_SPEAKER_START_FAIL /*-1321*/:
                return "打开扬声器失败，例如在 Windows 或 Mac 设备，扬声器的配置程序（驱动程序）异常，禁用后重新启用设备，或者重启机器，或者更新配置程序";
            case TXLiteAVCode.ERR_MIC_STOP_FAIL /*-1320*/:
                return "停止麦克风失败";
            case -1319:
                return "麦克风正在被占用中，例如移动设备正在通话时，打开麦克风会失败";
            case TXLiteAVCode.ERR_MIC_SET_PARAM_FAIL /*-1318*/:
                return "麦克风设置参数失败";
            case -1317:
                return "麦克风设备未授权，通常在移动设备出现，可能是权限被用户拒绝了";
            case -1316:
                return "摄像头正在被占用中，可尝试打开其他摄像头";
            case TXLiteAVCode.ERR_CAMERA_SET_PARAM_FAIL /*-1315*/:
                return "摄像头参数设置出错（参数不支持或其它）";
            case -1314:
                return "摄像头设备未授权，通常在移动设备出现，可能是权限被用户拒绝了";
            case TXLiveConstants.PUSH_ERR_INVALID_ADDRESS:
                return "直播，推流地址非法，例如不是 RTMP 协议的地址";
            case 0:
                return "无错误";
            case 1107:
                return "当前 CPU 使用率太高，无法满足软件编码需求，自动切换到硬件编码";
            case 1109:
                return "软编码启动失败";
            case 2001:
                return "直播，已经连接 RTMP 拉流服务器";
            case 2002:
                return "直播，已经与 RTMP 服务器握手完毕，开始拉流";
            case 2003:
                return "渲染首个视频数据包（IDR）";
            case 2004:
                return "视频播放开始";
            case 2005:
                return "视频播放进度";
            case 2006:
                return "视频播放结束";
            case 2007:
                return "视频播放 loading";
            case 2008:
                return "解码器启动";
            case 2009:
                return "下行视频分辨率改变";
            case 2010:
                return "点播，获取点播文件信息成功";
            case 2011:
                return "视频旋转角度发生改变";
            case 2012:
                return "消息事件";
            case 2013:
                return "点播，视频加载完毕";
            case 2014:
                return "点播，loading 结束";
            case TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC:
                return "直播，切流成功（切流可以播放不同画面大小的视频）";
            case TXLiveConstants.PLAY_EVT_GET_METADATA:
                return "视频流MetaData事件";
            case 2101:
                return "当前视频帧解码失败。";
            case 2102:
                return "当前音频帧解码失败。";
            case TXLiveConstants.PLAY_WARNING_RECONNECT:
                return "直播，网络断连; 已启动自动重连（自动重连连续失败超过三次会放弃）";
            case 2105:
                return "当前视频播放出现卡顿。";
            case 2106:
                return "硬解启动失败，采用软解码";
            case 2108:
                return "当前流硬解第一个 I 帧失败，SDK 自动切软解";
            case TXLiteAVCode.WARNING_SW_DECODER_START_FAIL /*2109*/:
                return "软解码器启动失败";
            case 2110:
                return "视频渲染失败";
            case 3001:
                return "直播，DNS 解析失败";
            case 3002:
                return "直播，服务器连接失败";
            case 3003:
                return "直播，与 RTMP 服务器握手失败";
            case 3004:
                return "直播，服务器主动断开";
            case 3005:
                return "直播，RTMP 读/写失败，将会断开连接";
            default:
                switch (i) {
                    case -3328:
                        return "无效参数";
                    case -3327:
                        return "请求退出连麦超时";
                    case -3326:
                        return "请求连麦超时";
                    default:
                        switch (i) {
                            case -3322:
                                return "旁路转推回包异常";
                            case -3321:
                                return "旁路转推请求超时";
                            case -3320:
                                return "进房参数 userSig 不正确";
                            case -3319:
                                return "进房参数 userID 不正确";
                            case -3318:
                                return "进房参数 roomId 错误";
                            case -3317:
                                return "进房参数 sdkAppId 错误";
                            case -3316:
                                return "进房参数为空，请检查 enterRoom:appScene: 接口调用是否传入有效的 param";
                            default:
                                switch (i) {
                                    case TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL:
                                        return "直播，切流失败（切流可以播放不同画面大小的视频）";
                                    case TXLiveConstants.PLAY_ERR_GET_PLAYINFO_FAIL:
                                        return "点播，获取点播文件信息失败";
                                    case TXLiveConstants.PLAY_ERR_HLS_KEY:
                                        return "点播，音视频流解密失败";
                                    case -2304:
                                        return "H265 解码失败";
                                    case TXLiveConstants.PLAY_ERR_FILE_NOT_FOUND:
                                        return "播放的文件不存在";
                                    default:
                                        switch (i) {
                                            case -1309:
                                                return "录屏失败，在 Android 平台，需要5.0以上的系统";
                                            case -1308:
                                                return "开始录屏失败，如果在移动设备出现，可能是权限被用户拒绝了，如果在 Windows 或 Mac 系统的设备出现，请检查录屏接口的参数是否符合要求";
                                            case TXLiveConstants.PUSH_ERR_NET_DISCONNECT:
                                                return "直播，推流出现网络断开，且经过多次重试无法恢复";
                                            case -1306:
                                                return "不支持的音频采样率";
                                            case -1305:
                                                return "不支持的视频分辨率";
                                            case -1304:
                                                return "音频帧编码失败，例如传入自定义音频数据，SDK 无法处理";
                                            case -1303:
                                                return "视频帧编码失败，例如 iOS 设备切换到其他应用时，硬编码器可能被系统释放，再切换回来时，硬编码器重启前，可能会抛出";
                                            case -1302:
                                                return "打开麦克风失败，例如在 Windows 或 Mac 设备，麦克风的配置程序（驱动程序）异常，禁用后重新启用设备，或者重启机器，或者更新配置程序";
                                            case -1301:
                                                return "打开摄像头失败，例如在 Windows 或 Mac 设备，摄像头的配置程序（驱动程序）异常，禁用后重新启用设备，或者重启机器，或者更新配置程序";
                                            default:
                                                switch (i) {
                                                    case 1001:
                                                        return "直播，已经连接 RTMP 推流服务器";
                                                    case 1002:
                                                        return "直播，已经与 RTMP 服务器握手完毕，开始推流";
                                                    case 1003:
                                                        return "打开摄像头成功";
                                                    case 1004:
                                                        return "录屏启动成功";
                                                    case 1005:
                                                        return "上行动态调整分辨率";
                                                    case 1006:
                                                        return "码率动态调整";
                                                    case 1007:
                                                        return "首帧画面采集完成";
                                                    case 1008:
                                                        return "编码器启动成功";
                                                    default:
                                                        switch (i) {
                                                            case 1018:
                                                                return "进入房间成功";
                                                            case TXLiveConstants.PUSH_EVT_ROOM_OUT:
                                                                return "退出房间";
                                                            case 1020:
                                                                return "下发房间成员列表（不包括自己）";
                                                            case 1021:
                                                                return "WiFi 切换到4G 会触发断线重连，此时需要重新进入房间（拉取最优的服务器地址）";
                                                            default:
                                                                switch (i) {
                                                                    case 1031:
                                                                        return "进房通知";
                                                                    case 1032:
                                                                        return "退房通知";
                                                                    case 1033:
                                                                        return "视频状态位变化通知";
                                                                    case 1034:
                                                                        return "音频状态位变化通知";
                                                                    default:
                                                                        switch (i) {
                                                                            case 1101:
                                                                                return "网络状况不佳：上行带宽太小，上传数据受阻";
                                                                            case 1102:
                                                                                return "直播，网络断连; 已启动自动重连（自动重连连续失败超过三次会放弃）";
                                                                            case 1103:
                                                                                return "硬编码启动出现问题，自动切换到软编码";
                                                                            default:
                                                                                return "";
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
