package com.example.playlistapi.controller;

import com.example.playlistapi.domain.Playlist;
import com.example.playlistapi.domain.Track;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @PostMapping("/userId")
    private ResponseEntity<Void> create(@PathVariable String userId, @RequestBody Playlist playlist) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{playlistId}")
    private ResponseEntity<Void> findById(@PathVariable String playlistId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    private ResponseEntity<Void> findAllByUserId(@PathVariable String userId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/playlistId")
    private ResponseEntity<Void> delete(@PathVariable String playlistId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/new-track/playlistId")
    private ResponseEntity<Void> addTrack(@PathVariable String playlistId, @RequestBody Track track) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
