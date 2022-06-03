# Project 1 - Flixster Movies App

Flixster Movies App shows the latest movies currently playing in theaters. The app utilizes the Movie Database API to display images and basic information about these movies to the user.

Time spent: 13 hours spent in total

## User Stories

The following **required** functionality is completed:

* [ ] User can **scroll through current movies** from the Movie Database API
* [ ] Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
* [ ] For each movie displayed, user can see the following details:
  * [ ] Title, Poster Image, Overview (Portrait mode)
  * [ ] Title, Backdrop Image, Overview (Landscape mode)
* [ ] Allow user to view details of the movie including ratings within a separate activity

The following **stretch** features are implemented:

* [ ] Improved the user interface by experimenting with styling and coloring.
* [ ] Apply rounded corners for the poster or background images using [Glide transformations](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#transformations)

## Video Walkthrough

Here's a walkthrough of implemented user stories:

https://imgur.com/a/20mLc8x
<img src='./FINAL.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [Kap](https://getkap.co/).

## Notes

Fixed Bug: Movie Title going out of screen -> set textview’s layout_width to 0dp instead of wrap_content like I had been doing 
Fixed Bug: Overview going out of screen

Encountered bug where when switching orientation to landscape mode, app would crash
Fixed Bug: Restarted vertical orientation item_movie.xml textview code -> app no longer crashes
* [ ] Changed layout width for item_movie.xml (vertical orientation) to 0dp
* [ ] Double checked constraints were correct

Encountered issue of not accessing API (app wouldn’t crash but no movies would show up in emulator) -> would hit onFailure condition which was shown in Logcat
Fixed Bug: Examined code in MainActivity.java (where the app access AsyncHttpClient and the JSON object) -> did not find anything wrong
* [ ] Asked TA for help and explained my testing process of going through event log and Logcat to check where error occurred
* [ ] TA explained it was an issue with the API 
* [ ] Solution: clear cache and restart Android Studio

Fixed UI: no longer has blank spaces between movies due to overviews that are longer than the poster
* [ ] Decided to use ellipses like the example given by CodePath
* [ ] Searched up how to do it on StackOverflow and read up on how maxLines worked https://stackoverflow.com/questions/10748796/android-how-to-limit-width-of-textview-and-add-three-dots-at-the-end-of-text 

Encountered bug where movie poster would have rounded corners but the movie poster imageview height would equal ConstraintLayout height

Fixed Bug: Set vertical movie poster imageview height to 180dp (one of the specifications was that the poster aspect ratio is 2:3) since poster imageview width is 120dp and landscape poster imageview height to 196dp (aspect ratio 16:9 and width is 350dp) 
* [ ] Attempted to set poster imageview bottom constraint to bottom of movie layout (ConstraintLayout)
* [ ] Different movies have different heights when using wrap_content for height because movie layout height is wrap_content and depends on overview height (which is also set to wrap_content)
* [ ] Chose to hardcode poster height in order to retain uniformity


## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
