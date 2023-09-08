package com.tencent.tav.decoder.muxer;

import java.util.List;

public class MediaMuxerFactory {
    private static DefaultMediaMuxerCreator defaultMuxerCreator = new DefaultMediaMuxerCreator();
    private static MediaMuxerCreator muxerCreator = null;

    public static class DefaultMediaMuxerCreator implements MediaMuxerCreator {
        private DefaultMediaMuxerCreator() {
        }

        public IMediaMuxer createMediaMuxer(String str, int i) {
            return new DefaultMediaMuxer(str, i);
        }

        public int parallelMux(List<IMediaMuxer> list) {
            return 0;
        }
    }

    public interface MediaMuxerCreator {
        IMediaMuxer createMediaMuxer(String str, int i);

        int parallelMux(List<IMediaMuxer> list);
    }

    public static IMediaMuxer createMediaMuxer(String str, int i) {
        MediaMuxerCreator mediaMuxerCreator = muxerCreator;
        return mediaMuxerCreator == null ? defaultMuxerCreator.createMediaMuxer(str, i) : mediaMuxerCreator.createMediaMuxer(str, i);
    }

    public static int parallelMux(List<IMediaMuxer> list) {
        MediaMuxerCreator mediaMuxerCreator = muxerCreator;
        return mediaMuxerCreator == null ? defaultMuxerCreator.parallelMux(list) : mediaMuxerCreator.parallelMux(list);
    }

    public static void setMuxerCreator(MediaMuxerCreator mediaMuxerCreator) {
        muxerCreator = mediaMuxerCreator;
    }
}
