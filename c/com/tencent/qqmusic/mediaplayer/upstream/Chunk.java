package com.tencent.qqmusic.mediaplayer.upstream;

public class Chunk {
    public final int bufferSize;
    public final long size;
    public final long start;

    public Chunk(int i, long j, long j2) {
        this.bufferSize = i;
        this.start = j;
        this.size = j2;
    }

    public boolean contains(long j) {
        if (isEndless()) {
            return j >= this.start;
        }
        long j2 = this.start;
        return j >= j2 && j <= j2 + this.size;
    }

    public boolean isEndless() {
        return this.size == -1;
    }

    public String toString() {
        return "Chunk{bufferSize=" + this.bufferSize + ", start=" + this.start + ", size=" + this.size + '}';
    }
}
