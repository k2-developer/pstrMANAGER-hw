package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];

    private final int maxViewPosterCount;

    public PosterManager(int maxViewPosterCount) {
        this.maxViewPosterCount = maxViewPosterCount;
    }

    public PosterManager() {
        this.maxViewPosterCount = 10;
    }

    public void addFilm(Poster poster) {
        int length = posters.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }
    
//    public Poster[] getLastPosters() {
//        Poster[] result = new Poster[Math.min(posters.length, maxViewPosterCount)];
//        int startPosition = posters.length - result.length;
//        for (int i = 0; i < result.length; i++){
//            result[i] = posters[startPosition + i];
//        }
//        return result;
//    }

    public Poster[] getLastPosters() {
        Poster[] result = new Poster[Math.min(posters.length, maxViewPosterCount)];
        //int startPosition = posters.length - result.length;
        for (int i = 0; i < result.length; i++){
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }
}


